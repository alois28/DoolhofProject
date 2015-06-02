package doolhof;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Marnix/Alois
 */

public class LevelPanel extends JPanel {

	Doolhof doolhof;
	
	public LevelPanel(Doolhof game)
	{		
		
		this.addKeyListener(new MoveListener());
		this.doolhof = game;
		this.setPreferredSize(new Dimension(600,400));
		setFocusable(true);  
		this.setLayout(new BorderLayout());
		JPanel pane = new JPanel();
                pane.add(new Timers(25));
		add(pane,BorderLayout.SOUTH);
		
	}


        @Override
	public void paintComponent(Graphics g)
	{
		doolhof.level.draw(g);
	}



	private class MoveListener extends KeyAdapter
	{


                @Override
		public void keyPressed (KeyEvent event)
		{
			
			switch (event.getKeyCode())
			{
			case KeyEvent.VK_LEFT:
				doolhof.pacman.move(0, -1);
				break;
			case KeyEvent.VK_RIGHT:
				doolhof.pacman.move(0, 1);
				break;
			case KeyEvent.VK_UP:
				doolhof.pacman.move(-1, 0);
				break;
			case KeyEvent.VK_DOWN:
				doolhof.pacman.move(1, 0);
				break;
			}

			repaint();
		}

	}
}
