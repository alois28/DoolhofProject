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


public class Pacman extends SpelObject {

     
    private static final Image player = new ImageIcon(Pacman.class.getResource("\\Plaatjes\\player.png")).getImage();
    
    
    public Pacman(Doolhof doolhof, int row, int col)
	{
		super(doolhof, row, col);

	}
    
     public void move(int drow, int dcol)
	{

		if( row+drow>=0 && col+dcol>=0 && row+drow<Level.WIDTH && col+dcol<Level.WIDTH && game.level.getPlan()[row+drow][col+dcol].item.isPassable() )
		{
			game.pacman.row = row+drow;
			game.pacman.col = col+dcol;

		}
	} 
     
    @Override
     public void draw(Graphics g) {
		g.drawImage(Pacman.player,col*Level.WIDTH, row*Level.HEIGHT,Level.WIDTH,Level.HEIGHT,null);
	}
    
     public void update() {}
     
    @Override
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(Pacman.player,x + (width), y+(height), width, height,null);
    }
    
   public void vuurt(){
       
       
   } 
   
   
    @Override
   public boolean isPassable() {
		return true;
	}
}

