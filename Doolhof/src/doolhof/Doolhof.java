/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Marnix/Alois
 */

public class Doolhof {
    
    static LevelPanel levelPanel;

	
	protected Level level;
	protected Pacman pacman;
        protected ArrayList<SpelObject> objecten;
	protected char[][] rep1;
	protected char[][] rep2;
        

        public Doolhof()
	{


		char w = 'w'; // Muur
		char c = 'c'; // Grass
		char e = 'e'; // exit


		// map voor level 1 (20 x 20 )
		rep1 = new char[][] {
				{w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w}       ,
				{w,c,c,c,w,c,c,c,w,c,c,c,c,c,c,c,c,c,c,w}	,
				{w,c,c,c,w,c,c,c,w,c,c,c,w,w,w,w,w,w,c,w}	,
				{w,c,c,c,w,c,c,c,w,c,c,c,c,c,c,c,c,c,c,w}	,
				{w,c,c,c,w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,w}	,
				{w,c,c,c,w,c,c,c,c,c,c,w,w,w,w,w,w,w,w,w}	,
				{w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,w}	,
				{w,c,w,w,w,w,w,w,w,w,w,c,c,c,c,c,c,c,c,w}	,
				{w,c,c,c,c,w,c,c,c,c,c,c,c,w,w,w,w,w,c,w}	,
				{w,c,c,c,c,w,c,c,c,c,c,c,c,c,c,c,c,c,c,w}	,
				{w,c,w,c,c,w,c,c,c,w,w,w,w,w,w,w,w,w,c,w}	,
				{w,c,w,c,c,w,c,c,c,c,c,c,c,c,w,c,c,c,c,w}	,
				{w,c,w,c,c,w,c,c,c,c,c,c,c,c,w,c,c,c,c,w}	,
				{w,c,w,c,c,w,c,w,w,w,w,w,w,c,w,c,c,c,c,w}	,
				{w,c,w,c,c,c,c,c,c,c,c,c,c,c,w,c,c,c,c,w}	,
				{w,c,w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,w,c,w}	,
				{w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,w}	,
				{w,c,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,c,w}	,
				{w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,e,w}	,
				{w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w}	,
		};

		//map voor level 2 (20 x 20 )
		rep2 = new char[][] {
                                {c,c,c,c,c,c,c,c,c,c,c,c,c,w,w,w,w,w,c,w}       ,
				{c,c,w,c,w,c,c,c,w,c,c,c,c,c,c,c,c,c,c,w}	,
				{c,c,c,c,w,c,c,c,w,c,c,c,w,w,w,w,w,w,c,c}	,
				{c,c,c,c,w,c,c,c,w,c,c,c,c,c,c,c,c,c,c,c}	,
				{c,c,c,c,w,c,c,c,w,c,c,c,c,c,c,c,c,c,c,c}	,
				{c,c,c,c,w,c,c,c,w,c,c,w,w,w,w,w,w,w,w,c}	,
				{c,c,c,c,c,c,c,c,w,c,c,c,c,c,c,w,c,c,c,c}	,
				{c,c,c,c,c,c,c,c,w,c,c,w,w,w,w,w,c,c,c,c}	,
				{c,w,w,w,w,w,w,w,w,c,c,c,c,c,c,w,c,c,c,c}	,
				{c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c}	,
				{c,c,w,c,c,c,c,c,c,w,w,w,w,w,w,w,w,w,c,c}	,
				{c,c,w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c}	,
				{c,c,w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c}	,
				{c,c,w,c,c,c,c,w,w,w,w,w,w,w,w,w,w,c,c,c}	,
				{c,c,w,c,c,c,c,c,c,c,c,c,w,c,c,c,c,c,c,c}	,
				{c,c,w,c,c,w,w,w,w,w,w,w,w,w,w,w,w,w,c,c}	,
				{c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c}	,
				{c,c,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,c,c,c}	,
				{c,w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c}	,
				{w,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c}	,
		};



		//  Level 1
		level = new Level(this,rep1,1);

		pacman = new Pacman(this,2,2);

		objecten = new ArrayList<>();
		objecten.add(new Vijand(this,5,9,1,0));
		objecten.add(new Vijand(this,15,8,0,2));
		objecten.add(new Vijand(this,14,18,1,1));
		objecten.add(new Vijand(this,8,12,1,0));
		objecten.add(new Bazooka(this,7,14,0,1));
		objecten.add(new Bazooka(this,16,6,0,0));

		levelPanel = new LevelPanel(this);

	}
        

    public void PauzeerSpel() {

    }

    public void Restart() {

    }

    public static void main(String[] args) {
        Doolhof doolhof = new Doolhof();
        
        JFrame frame = new JFrame ("Doolhof");
	frame.setPreferredSize(new Dimension(430,530));
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(levelPanel);
	frame.pack();
	frame.setVisible(true);
        

    }
    
    private class TimeListener2 implements ActionListener
	{

		Doolhof doolhof;
		
		TimeListener2(Doolhof doolhof)
		{
			this.doolhof = doolhof;
		}
                
                @Override
		public void actionPerformed(ActionEvent arg0) {

			
			Doolhof.levelPanel.repaint();


		}

	}
}
          
         
     


    
                




