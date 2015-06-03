/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;


import static doolhof.Vak.height;
import static doolhof.Vak.width;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;


/**
 *
 * @author Marnix/Alois
 */


public class Pacman extends SpelObject {

     
    private static final Image player = new ImageIcon(Pacman.class.getResource("\\Plaatjes\\player.png")).getImage();
//    private Direction lastMoveDirection = Direction.DOWN;
//    private final HashMap<Integer, String> keyBindings = new HashMap<>();
    
    
    public Pacman(Doolhof doolhof, int row, int col)
	{
		super(doolhof, row, col);
//                defaultKeyBindings();
//                KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);

	}
    
     public void move(int drow, int dcol)
	{

		if( row+drow>=0 && col+dcol>=0 && row+drow<Level.COLUMNS && col+dcol<Level.COLUMNS && game.level.gettileList()[row+drow][col+dcol].item.isPassable() )
		{
			game.pacman.row = row+drow;
			game.pacman.col = col+dcol;

		}
	} 
     
    @Override
     public void draw(Graphics g) {
		g.drawImage(Pacman.player,col*Level.COLUMNS, row*Level.ROWS,Level.COLUMNS,Level.ROWS,null);
	}
    
     public void update() {}
     
    @Override
    public void drawItem(Graphics g, int x, int y) {
        g.drawImage(Pacman.player,x + (width), y+(height), width, height,null);
    }
    
   public void vuurt(){
       
       
   }
   
//	public void moveTo(int toX, int toY) {				
//		this.moveTo(toX, toY);
//		
//		Vak nextTile = game.level.getTiles(toX, toY);
//		
//		// Die if tile has fire
//		if(nextTile.equals(SpelObject.class)) {
//			isPassable();
//		}
//	}
//	
//	/**
//	 * Override to get latest move direction.
//	 */
//	public void move(int x, int y) {
//            Direction direction = lastMoveDirection;
//		move(direction.getX(), direction.getY());
//	}
//        
//	public void move(Direction dir) {
//		lastMoveDirection = dir;
//		this.move(dir);
//	}
//   
//   protected boolean executeAction(String action) {
//		if(action.equals("move_left")) move(Direction.LEFT);
//		else if(action.equals("move_right")) move(Direction.RIGHT);
//		else if(action.equals("move_up")) move(Direction.UP);
//		else if(action.equals("move_down")) move(Direction.DOWN);
//		else if(action.equals("exit_game")) System.exit(0);
//		else return false;
//		
//		return true;
//	}
//   
//   public void defaultKeyBindings() {
//		keyBindings.clear();
//		
//		// ID specifics:
//		switch(1) {
//		case 1:
//			keyBindings.put(KeyEvent.VK_LEFT, "move_left");
//			keyBindings.put(KeyEvent.VK_RIGHT, "move_right");
//			keyBindings.put(KeyEvent.VK_UP, "move_up");
//			keyBindings.put(KeyEvent.VK_DOWN, "move_down");
//			keyBindings.put(KeyEvent.VK_SPACE, "place_bomb");
//		}
//		
//		// Others
//		keyBindings.put(KeyEvent.VK_ESCAPE, "exit_game");
//	}
//
//    @Override
//	public boolean dispatchKeyEvent(KeyEvent e) {
//
//		if(keyBindings.containsKey(e.getKeyCode())) {
//			String action = keyBindings.get(e.getKeyCode());
//			boolean success = executeAction(action);
//		}
//		return false;
//	}
        
    @Override
   public boolean isPassable() {
		return false;
	}
}

