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

public class Exit extends SpelObject {
    
    private static final Image finish = new ImageIcon(Exit.class.getResource("\\Plaatjes\\finish.png")).getImage();

    public Exit(Doolhof game, int row, int col) {
        super(game, row, col);
    }
    public Exit()
	{
		super(1);
	}
    
    @Override
    public void pakOp(){
        
        
    } 
    
    @Override
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(Exit.finish,x + (width/4), y+(height/4), width, height,null);
    }
    
    @Override
    public void draw(Graphics g) {
		g.drawImage(Exit.finish,col*Level.WIDTH, row*Level.HEIGHT,Level.WIDTH,Level.HEIGHT,null);
	}
    
    @Override
    public boolean isPassable() {
		return true;
	}
}
