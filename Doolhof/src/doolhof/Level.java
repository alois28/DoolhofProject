/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import java.awt.Graphics;

/**
 *
 * @author Marnix/Alois
 */


public final class Level {

	public static final int WIDTH  = 20;
	public static final int HEIGHT = 20;
	private static int code; // Level Code
	private final Vak[][] plan = new Vak[WIDTH][HEIGHT];
	private char[][] tiles;
	private final Doolhof doolhof;

	
	public Level(Doolhof doolhof, char[][] levelRep,int code)
	{
		Level.code = code;
		this.setTiles(levelRep);
		this.doolhof = doolhof;
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

					this.plan[i][j] = new Vak(new Muur()) {

                                            
                                        };
					this.plan[i][j].drawTile(g, j*WIDTH, i*HEIGHT);
				}
				//  tekent grass
				else if(this.getTiles()[i][j] == 'c')
				{	

					this.plan[i][j] = new Vak(new Grass()) {

                                            
                                        };
					this.plan[i][j].drawTile(g, j*WIDTH, i*HEIGHT);
				}
				//  tekent exit
				else if(this.getTiles()[i][j] == 'e')
				{	

					this.plan[i][j] = new Vak(new Exit()) {

                                            
                                        };
					this.plan[i][j].drawTile(g, j*WIDTH, i*HEIGHT);
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

	
	public Vak[][] getPlan()
	{
		return plan;
	}

	
	public char[][] getTiles() {
		return tiles;
	}

	
	public void setTiles(char[][] tiles) {
		this.tiles = tiles;
	}
}
