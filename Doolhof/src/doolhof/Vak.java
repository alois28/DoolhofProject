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
public class Vak {

    SpelObject item;
    boolean isItem;
        
    static int width = Level.COLUMNS;
    static int height = Level.ROWS;
    int row, col;
    private int positionX, positionY;
    
    public Vak(SpelObject item)
    {
		this.item=item;
		isItem = true;
    }
    
    public Vak(int posX, int posY) 
    {
		this.positionX = posX;
		this.positionY = posY;
    }
    
    public int getX() 
    {
	return positionX;
    }

    public int getY() 
    {
	return positionY;
    }
        
    public Vak() {
        this.item=null;
	isItem = false;
                
        this.row = 0;
        this.col = 0;
    }
    
    public void drawTile(Graphics g, int x, int y) {
		
		// als er geen spelobject op Vak staat teken groen
		if(!this.isItem)
		{
			g.fillRect(x, y, width, height);
                        

		}
		else // anders teken spelobject
		{
			item.drawItem(g,  x, y);
		}
	}

    public void setRow(int row) {
        this.row = row;
    }
    
    public void setCol(int col) {
        this.col = col;
    }

}
