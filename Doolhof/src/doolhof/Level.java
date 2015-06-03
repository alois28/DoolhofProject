/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Marnix/Alois
 */


public final class Level {

	public static final int COLUMNS  = 20;
	public static final int ROWS = 20;
	private static int code; // Level Code
	private final Vak[][] tileList = new Vak[COLUMNS][ROWS];
        private char[][] tiles;
	private final Doolhof doolhof;

	
	public Level(Doolhof doolhof, char[][] levelRep,int code)
	{
		Level.code = code;
		this.setTiles(levelRep);
		this.doolhof = doolhof;
                
                for(int x = 0; x < COLUMNS; x++) {
			for(int y = 0; y < ROWS; y++) {
				tileList[x][y] = new Vak(x, y);
			}
                }
                
                
	}
	
	public void draw(Graphics g)
	{

		/// doorloop arry van map en tekent map
		for(int i=0;i<getTiles().length;i++)
		{
			for(int j=0;j<getTiles()[i].length;j++)
			{

				
				//  tekent muur
				if(this.getTiles()[i][j] == 'w')
				{	

					this.tileList[i][j] = new Vak(new Muur()) {

                                            
                                        };
					this.tileList[i][j].drawTile(g, j*COLUMNS, i*ROWS);
				}
				//  tekent grass
				else if(this.getTiles()[i][j] == 'c')
				{	

					this.tileList[i][j] = new Vak(new Grass()) {

                                            
                                        };
					this.tileList[i][j].drawTile(g, j*COLUMNS, i*ROWS);
				}
				//  tekent exit
				else if(this.getTiles()[i][j] == 'e')
				{	

					this.tileList[i][j] = new Vak(new Exit()) {

                                            
                                        };
					this.tileList[i][j].drawTile(g, j*COLUMNS, i*ROWS);
				}

			}
		}

		// teken pacman
                doolhof.pacman.draw(g);

		// teken sepobjecten
		for(SpelObject m : doolhof.objecten)
		{
			if(!m.equals(null))
				m.draw(g);
                        
		}

	}
        
        public ArrayList<Vak> getTileNeighbours(Vak vak) {
		ArrayList<Vak> neighbours = new ArrayList<>();
		int fromX = vak.getX();
		int fromY = vak.getY();
		
		neighbours.add(getTiles(fromX-1, fromY)); // Left
		neighbours.add(getTiles(fromX+1, fromY)); // Right
		neighbours.add(getTiles(fromX, fromY-1)); // Up
		neighbours.add(getTiles(fromX, fromY+1)); // Down
		
		
		return neighbours;
	}
        
//        public Vak nextTile(Vak startTile, Direction dir) {
//		int x = startTile.getX() + dir.getX();
//		int y = startTile.getY() + dir.getY();
//		
//		return this.getTiles(x, y);
//	}

        public Vak getTiles(int x, int y) {
		if(x < 0 || x > COLUMNS-1 || y < 0 || y > ROWS-1) return null;
		
		return tileList[x][y];
	}
        public Vak[][] gettileList()
	{
		return tileList;
	}
        
        
        public void setTiles(char[][] tiles) {
		this.tiles = tiles;
	}
        
        public char[][] getTiles() {
		return tiles;
	}
}
