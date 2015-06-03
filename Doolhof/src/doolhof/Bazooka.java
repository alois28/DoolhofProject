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

public class Bazooka extends SpelObject {

   private static final Image bazooka = new ImageIcon(Bazooka.class.getResource("\\Plaatjes\\rocket_launcher.png")).getImage();
    
   int drow ;
   int dcol;
        
   public Bazooka(Doolhof game, int row, int col, int drow, int dcol)
	{
		super(game, row, col);
		this.dcol = dcol;
		this.drow = drow;

	}
   
   private int munitie;
   private boolean geschoten;
   
   
   public void verwijder(){
       
       
   }
   
   @Override
   public void drawItem(Graphics g, int x, int y) {
        g.drawImage(Bazooka.bazooka,x + (width), y+(height), width, height,null);
    }
   
   @Override
   public void draw(Graphics g) {
		g.drawImage(Bazooka.bazooka,col*Level.COLUMNS, row*Level.ROWS,Level.COLUMNS,Level.ROWS,null);
	}
   
   @Override
   public boolean isPassable() {
		return true;
	}
        
    }    

