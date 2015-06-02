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

    static Image helper = new ImageIcon(Exit.class.getResource("\\Plaatjes\\friend.png")).getImage();
    
    public Helper(Doolhof game, int row, int col)
	{
		super(game, row, col);
		
	}
    
    public void showRouteToExit(){
        
        
    } 
    
    @Override
    public void pakOp(){
        
        
    }
    
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(this.helper,x + (width), y+(height), width, height,null);
    }
    
    public void draw(Graphics g) {
		g.drawImage(this.helper,col*Level.WIDTH, row*Level.HEIGHT,Level.WIDTH,Level.HEIGHT,null);
	}
    
    public boolean isPassable() {
		return true;
	}
}
