
//Name:Sarthak Seth	
//USC NetID:sethsart@usc.edu
//CS 455 PA1
//Spring 2018
import java.util.Random;
import java.util.Scanner;
/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {
	
		private Random generator;
		private int numberOfTrials;
		private int twoHeadTosses;
		private int twoTailTosses;
		private int oneHeadOneTailTosses;
	


   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
	    
	 
	   	twoHeadTosses = 0;
	   	twoTailTosses = 0;
	   	oneHeadOneTailTosses = 0;
	   	generator = new Random();
	   	numberOfTrials= 0;
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
		twoHeadTosses = 0;
	   	twoTailTosses = 0;
	   	oneHeadOneTailTosses = 0;
	   numberOfTrials = numberOfTrials + numTrials;
	   	
	   	for(int i=0;i<numberOfTrials;i++)            //This loop is used for simulation and to calculate the no. of 
	   	{											//heads heads, tails tails and heads tails generated
	   		int x = generator.nextInt(2);
	   		int y = generator.nextInt(2);
	   			if(x==0 && y==0)
	   			{	
		   		    this.twoHeadTosses++;
		   		}
		   		
	   			else if(x==1 && y==1)
		   		{
		   			this.twoTailTosses++;
		   				   				
		   		}
		   		else 
		   		{
		   			this.oneHeadOneTailTosses++;
		   		}
	   
	   }
	   	
	   }
  




/**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       	
	   return numberOfTrials; 
	   
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   	public int getTwoHeads() {
   		
   		int hh=twoHeadTosses;
   		
   		return hh ;
   	}	


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       
	   int tt=twoTailTosses;
	   
	   
       return tt; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
	   
	  int ht=oneHeadOneTailTosses;
	
	   return ht; 

   	}
   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   
	   numberOfTrials = 0;
	   twoHeadTosses = 0;
	   twoTailTosses = 0;
	   oneHeadOneTailTosses = 0;
 
   }

}
