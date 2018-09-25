
//Name:Sarthak Seth	
//USC NetID:sethsart@usc.edu
//CS 455 PA1
//Spring 2018
import java.awt.Component;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 * class CoinSimViewer
 * 
 * Contains the main method. Prompts for the number of trials,
 * and creates the JFrame containing the CoinSimComponent.
 * After the program Runs, it prompts for number of trials and 
 * when an appropriate value is entered, it simulates the program and gives a 
 * graphical representation, in terms of bar chart, of the values of different
 * outcomes-Heads Heads, Tails Tails ,Heads Tails.
 * 
 * 
 **/
public class CoinSimViewer {

	public static void main(String[] args) {
	
		
		CoinTossSimulator sim = new CoinTossSimulator();
		
		Scanner in = new Scanner(System.in);
		
		int numTrials;
		
		
		
		System.out.print("Enter number of trials:");
		numTrials =in.nextInt();
		
		while (numTrials<1)
		{
			System.out.println("ERROR: Number entered must be greater than 0.");
			System.out.print("Enter number of trials:");
			numTrials=in.nextInt();
		}
		
		sim.run(numTrials);
		

		JFrame frame= new JFrame();
		frame.setSize(800, 500);
		frame.setTitle("CoinSim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CoinSimComponent Component= new CoinSimComponent(sim.getTwoHeads(),sim.getHeadTails(),sim.getTwoTails(),sim.getNumTrials());
		frame.add(Component);
		frame.setVisible(true);
	}

}
