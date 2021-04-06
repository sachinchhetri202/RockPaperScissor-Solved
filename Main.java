/** 
    * Class Assignment Computer Science 1400 
    * @author Sachin Chhetri <sachinchhetri202@gmail.com>
    * Object Oriented Programming, Constructers, Loops, Switch/Case, Handling Exceptions, Conditions. 
    */

import java.util.*;

public class Main
{

	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		RockPaperScissors rps = new RockPaperScissors ();  //***YOUR CLASS
				
		int numGames = 0;
		String userChoice = "";
		String cpuChoice = "";
		int winner = -1;
		int numUserWins = 0;
		int numCPUWins = 0;
      	boolean hasError = false;
		
		System.out.println("Welcome to Rock, Paper, Scissors!\n");
		
      do
      {
         try
         {
            //Reset error checker
            hasError = false;
         
      		//Get odd number of games
      		System.out.println("How many rounds would you like to play?");
      		numGames = in.nextInt();
      		
      		while (numGames % 2 == 0) //Even number
      		{
      			System.out.println("Sorry, number of games must be odd.  Please try again:");
      			numGames = in.nextInt();
      		}
         }
         catch (InputMismatchException e)
         {
            //Flush the buffer
            in.nextLine();
            
            hasError = true;
            
            System.out.println("Invalid input.  Please enter a number.");
         }
      } while (hasError);
		
		//Flush the buffer
		in.nextLine();
		
		//Play the game for the number of rounds the user entered
		for (int i = 1; i <= numGames; i++)
		{
			//Get the user and computer choices
			userChoice = rps.getUserChoice();  //***YOUR METHOD
			cpuChoice = rps.getCPUChoice();   //***YOUR METHOD
			
			System.out.println("Computer chooses " + cpuChoice);
			
			//Pick winner
			winner = rps.pickWinner(userChoice, cpuChoice);  //***YOUR METHOD
         
         switch (winner)
         {
            case 0:
               System.out.println("It's a tie!  Play again.");
               break;
               
            case 1:
               System.out.println("User wins!");
               numUserWins++;
               break;
               
            case 2:
               System.out.println("Computer wins!");
               numCPUWins++;
               break;
               
            default:
               System.out.println("Error in picking winner!");
               break;
         }
			
		} //end for
		
		//Print results
		System.out.println("\n\nUser wins: " + numUserWins);
		System.out.println("Computer wins: " + numCPUWins);
		
		if (numUserWins > numCPUWins)
		{
			System.out.println("\nThe user won!");
		}
		if (numCPUWins > numUserWins)
		{
			System.out.println("The computer won!");
		}
		
		//Close game
		System.out.println("\nThank you for playing!");
		
	} //end main

} //end class
