/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import static doolhof.Vak.height;
import static doolhof.Vak.width;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Marnix/Alois
 */

public class Helper extends SpelObject {

    private static final Image helper = new ImageIcon(Helper.class.getResource("\\Plaatjes\\friend.png")).getImage();
    
    public Helper(Doolhof game, int row, int col)
	{
		super(game, row, col);
		
	}
    
    public void showRouteToExit(){
        
        
    } 
    
    @Override
    public void pakOp(){
        
        
    }
    
    @Override
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(Helper.helper,x + (width), y+(height), width, height,null);
    }
    
    @Override
    public void draw(Graphics g) {
		g.drawImage(Helper.helper,col*Level.COLUMNS, row*Level.ROWS,Level.COLUMNS,Level.ROWS,null);
	}
    
    @Override
    public boolean isPassable() {
		return true;
	}
}
