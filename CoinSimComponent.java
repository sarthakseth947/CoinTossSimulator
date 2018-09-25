
//Name:Sarthak Seth	
//USC NetID:sethsart@usc.edu
//CS 455 PA1
//Spring 2018
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import javax.swing.JComponent;
 import java.awt.Color;
 /**
  * class CoinSimComponent
  * 
  * Extends the JComponent class and specify how the component should be painted 
  * to provide the desired result
  * 
  * 
  */
 public class CoinSimComponent extends JComponent {
	 	
	 private int headsHeads;
	 private int tailsTails;
	 private int headsTails;
	 private double total;
 

/**  Creates a CoinSimComponent constructor to pass the value of no. of head tails, 
 * Tails Tails, Heads Heads and total no. of trials from the Coin Toss SImulator  
 *
 * @param hh  No. of Heads heads generated during the coin toss
 * @param ht  No. of Heads Tails generated during the coin toss
 * @param tt  No. of Tails Tails generated during the coin toss
 * @param tot Total No. of trials that take place
 */
	 public CoinSimComponent (int hh,int ht,int tt,int tot)

	 {
		 headsHeads=hh;
		 tailsTails=tt;
		 headsTails=ht;
		 total=tot; 
	 }
	 

/** This paintComponent will contain instructions to draw bar charts
  * 
  * @param g this object stores the graphics state of the drawing program like color,font etc.
  */
	 public void paintComponent(Graphics g)
	 { 
		 Graphics2D g2=(Graphics2D) g;
		 
		 final Color HEADS_HEADS_COLOR=Color.RED;
		 final Color TAILS_TAILS_COLOR=Color.BLUE;
		 final Color HEADS_TAILS_COLOR=Color.GREEN;
		 
		 final int VERTICAL_BUFFER=50;
		 
		 int perc1 =  (int) Math.round(headsHeads*100/total);
		 double scal = (getHeight()-2*VERTICAL_BUFFER)/total;
		 final int BAR_WIDTH = 50;
		 int w = ( getWidth() -BAR_WIDTH*3)/4;
		
		 Bar bar1 = new Bar( getHeight()-VERTICAL_BUFFER, w , BAR_WIDTH , headsHeads, scal , HEADS_HEADS_COLOR , " Two Heads: "+headsHeads +" ("+perc1+"%)" );
		 bar1.draw(g2);
		 
		 
		 int perc3 = (int) Math.round( headsTails*100/total );
		 Bar bar2 = new Bar( getHeight()-VERTICAL_BUFFER , 2*w+BAR_WIDTH  , BAR_WIDTH , headsTails , scal ,HEADS_TAILS_COLOR , "A Head and a Tail: "+headsTails +" ("+perc3+"%)" );
		 bar2.draw(g2);
		 
		
		 int perc2 = (int) Math.round(tailsTails*100/total);
		 Bar bar3 = new Bar( getHeight()-VERTICAL_BUFFER , 3*w+2*BAR_WIDTH , BAR_WIDTH , tailsTails , scal , TAILS_TAILS_COLOR , "Two Tails "+tailsTails +" ("+perc2+"%)");
		 bar3.draw(g2);		 	
}
	 
}
