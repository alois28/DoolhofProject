/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Alois
 */


public class Grass extends SpelObject {
    
    static Image grass = new ImageIcon(Grass.class.getResource("\\Plaatjes\\grass.png")).getImage();
    
    public Grass(Doolhof game, int row, int col)
	{
		super(game, row, col);
		
	}
    
    public Grass()
	{
		super(1);
	}
    
    @Override
    public void pakOp(){
        
        
    }
    
    
    public boolean isPassable() {
		return true;
	}
    
    @Override
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(this.grass,x + (width/4), y+(height/4), width, height,null);
    }
    
    public void draw(Graphics g) {
		g.drawImage(this.grass,col*Level.WIDTH, row*Level.HEIGHT,Level.WIDTH,Level.HEIGHT,null);
	}
}
