
//Name:Sarthak Seth	
//USC NetID:sethsart@usc.edu
//CS 455 PA1
//Spring 2018
/**
 * class CoinTossSimulatorTester
 * 
 * Contains the main method. in this we enter random vaules of number of trials 
 * and tests the program if its giving us the required results that we expect
 * 
 * 
 *
 */
public class CoinTossSimulatorTester {

	public static void main(String[] args) {
	
		CoinTossSimulator tester = new CoinTossSimulator();
		
		boolean checker;
		
		if( tester.getNumTrials()==tester.getHeadTails()+tester.getTwoHeads()+tester.getTwoTails() )
		{	
			checker=true;
		}
		else 
		{	checker=false;						//Check whether the expected results is equal to the acquired results
		}
		
		System.out.println("After constructor:");
		System.out.printf("Number of trials [exp:0]: %d \n", tester.getNumTrials());
		System.out.printf("Two-head tosses: %d\n", tester.getTwoHeads());
		System.out.printf("Two-tail tosses: %d\n", tester.getTwoTails() );
		System.out.printf("One-head one-tail tosses: %d\n", tester.getHeadTails());
		System.out.printf("Tosses add up correctly? %s\n\n",checker);

		
		tester.run(1);
		if( tester.getNumTrials()==tester.getHeadTails()+tester.getTwoHeads()+tester.getTwoTails() )
		{	
			checker=true;
		}
		else 
		{	checker=false;
		}
		
		System.out.println("After run(1):");
		System.out.printf("Number of trials [exp:1]: %d \n", tester.getNumTrials());
		System.out.printf("Two-head tosses: %d\n", tester.getTwoHeads());
		System.out.printf("Two-tail tosses: %d\n", tester.getTwoTails() );
		System.out.printf("One-head one-tail tosses: %d\n", tester.getHeadTails());
		System.out.printf("Tosses add up correctly? %s\n\n",checker);

		
		tester.run(10);
		if( tester.getNumTrials()==tester.getHeadTails()+tester.getTwoHeads()+tester.getTwoTails() )
		{	
			checker=true;
		}
		else 
		{	checker=false;
		}
		
		System.out.println("After run(10):");
		System.out.printf("Number of trials [exp:11]: %d \n", tester.getNumTrials());
		System.out.printf("Two-head tosses: %d\n", tester.getTwoHeads());
		System.out.printf("Two-tail tosses: %d\n", tester.getTwoTails() );
		System.out.printf("One-head one-tail tosses: %d\n", tester.getHeadTails());
		System.out.printf("Tosses add up correctly? %s\n\n",checker);

		
		tester.run(100);
		if( tester.getNumTrials()==tester.getHeadTails()+tester.getTwoHeads()+tester.getTwoTails() )
		{	
			checker=true;
		}
		else 
		{	checker=false;
		}
		
		System.out.println("After run(100):");
		System.out.printf("Number of trials [exp:111]: %d \n", tester.getNumTrials());
		System.out.printf("Two-head tosses: %d\n", tester.getTwoHeads());
		System.out.printf("Two-tail tosses: %d\n", tester.getTwoTails() );
		System.out.printf("One-head one-tail tosses: %d\n", tester.getHeadTails());
		System.out.printf("Tosses add up correctly? %s\n\n",checker);
		
		
		System.out.println("After Reset");
		tester.reset();
		if( tester.getNumTrials()==tester.getHeadTails()+tester.getTwoHeads()+tester.getTwoTails() )
		{	
			checker=true;
		}
		else 
		{	checker=false;
		}
		System.out.printf("Number of trials [exp:]: %d \n", tester.getNumTrials());
		System.out.printf("Two-head tosses: %d\n", tester.getTwoHeads());
		System.out.printf("Two-tail tosses: %d\n", tester.getTwoTails() );
		System.out.printf("One-head one-tail tosses: %d\n", tester.getHeadTails());
		System.out.printf("Tosses add up correctly? %s\n\n",checker);
		
		tester.run(500);
		System.out.println("After run(500):");
		
		if( tester.getNumTrials()==tester.getHeadTails()+tester.getTwoHeads()+tester.getTwoTails() )
		{	
			checker=true;
		}
		else 
		{	checker=false;
		}
		System.out.printf("Number of trials [exp:500]: %d \n", tester.getNumTrials());
		System.out.printf("Two-head tosses: %d\n", tester.getTwoHeads());
		System.out.printf("Two-tail tosses: %d\n", tester.getTwoTails() );
		System.out.printf("One-head one-tail tosses: %d\n", tester.getHeadTails());
		System.out.printf("Tosses add up correctly? %s\n\n",checker);
		
	}


}
 
