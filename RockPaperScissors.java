import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    String userChoice = "";
    String cpuChoice = "";
    
    public String getUserChoice(){
        System.out.print("Rock, Paper, or Scissors?: ");
        userChoice = in.nextLine();
        
        while(!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper") && !userChoice.equalsIgnoreCase("Scissors")){
            System.out.println("Sorry, \"" + userChoice + "\" is not a valid entry.");
            System.out.print("Rock, Paper, or Scissors?: ");
            userChoice = in.nextLine();
        }
        return userChoice;
        
    }

    public String getCPUChoice(){
        int  wordNumber;
        wordNumber = r.nextInt((3) + 1);
        if (wordNumber == 1){
            cpuChoice = "Rock";
        }
        else if (wordNumber == 2){
            cpuChoice = "Paper";
        }
        else if (wordNumber == 3){
            cpuChoice = "Scissors";
        }
        return cpuChoice;

    }

    public int pickWinner(String userChoice, String cpuChoice){
        if (userChoice.equalsIgnoreCase(cpuChoice)){
            return 0;
        }
        else if (userChoice.equalsIgnoreCase("Paper") && cpuChoice.equalsIgnoreCase("Rock")){
            return 1;
        }
        else if(userChoice.equalsIgnoreCase("Rock") && cpuChoice.equalsIgnoreCase("Scissors")){
            return 1;
        }
        else if(userChoice.equalsIgnoreCase("Scissors") && cpuChoice.equalsIgnoreCase("Paper")){
            return 1;
        }
        else{
            return 2;
        }
        
    }


}
