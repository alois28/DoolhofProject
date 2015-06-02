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


public class Muur extends SpelObject{

    static Image crate = new ImageIcon(Muur.class.getResource("\\Plaatjes\\crate.png")).getImage();
    
    
    public Muur(Doolhof game, int row, int col)
	{
		super(game, row, col);
		
	}
    
    public Muur()
	{
		super(1);
	}
    
    @Override
    public void pakOp(){
        
        
    }
    
    private boolean vernietigBaar;
       
    
      public void verdwijnen(){
                    
          
      }
      
      public void draw(Graphics g) {
		g.drawImage(this.crate,col*Level.WIDTH, row*Level.HEIGHT,Level.WIDTH,Level.HEIGHT,null);
	}
      
    @Override
      public boolean isPassable() {
		return false;
	}

    @Override
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(this.crate,x + (width/4), y+(height/4), width, height,null);
    }
        
    }  

