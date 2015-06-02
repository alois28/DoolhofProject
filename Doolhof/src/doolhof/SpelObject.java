package doolhof;

import java.awt.Graphics;


/**
 *
 * @author Marnix/Alois
 */

public abstract class SpelObject {
    Doolhof game;
    int row, col;
    int value;
        
    public SpelObject(Doolhof game, int row, int col)
	{
		this.game = game;
		this.row = row;
		this.col = col;
	}
    
    public SpelObject(int value)
	{
		this.value = value;
	}
    
    public abstract void drawItem(Graphics g, int x, int y);
    
    public abstract void draw(Graphics g);
    
    public int getValue()
	{
		return value;
	}
    
    public void pakOp(){
      
        
        
    }
    
    public abstract boolean isPassable();
}





