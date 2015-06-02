/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import static doolhof.Vak.height;
import static doolhof.Vak.width;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Marnix/Alois
 */


public class Vijand extends SpelObject {
    
   static Image vijand = new ImageIcon(Muur.class.getResource("\\Plaatjes\\Enemy.png")).getImage();
    
   int drow ;
   int dcol;
        
   public Vijand(Doolhof game, int row, int col, int drow, int dcol)
	{
		super(game, row, col);
		this.dcol = dcol;
		this.drow = drow;

	}
   
   public void strafPunten(){
       
       
   } 
      
    @Override
   public void pakOp(){
       
   }   
   
   public void drawItem(Graphics g, int x, int y) {
        g.drawImage(this.vijand,x + (width), y+(height), width, height,null);
    }
   
   public void draw(Graphics g) {
		g.drawImage(this.vijand,col*Level.WIDTH, row*Level.HEIGHT,Level.WIDTH,Level.HEIGHT,null);
	}
   
   @Override
   public boolean isPassable() {
		return true;
	}
}
