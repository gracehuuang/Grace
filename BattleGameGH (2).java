//*****************************************************************
//*****************************************************************                                                          
//** NAME        :  Grace Huang                                  **
//** Program Name:  BattleGameGH.java                            **
//** Program Date:  18/01/17                                     **
//** program desc:  here we have a program that will open up an  **
//*                 input file and read it. we have created 6    **
//**                variable for the players and the battle. we  **            
//**                a try and a catch to read in file and catch  **                           
//**                error. the program will will read in the     **
//**                characters and determine who is the winner   **
//**                based on the total hit points.               **
//*****************************************************************
//*****************************************************************
import java.io.*;
public class BattleGameGH
{
    public static void main (String[] args)
    {
	String BattleText; 
	String PlayerOne; 
	String PlayerTwo;
	int BattleNumber = 0; 
	int PlayerOneTHP = 0;
	int PlayerTwoTHP = 0;
	
	try{
	 
	    System.out.println ("Battle Game");
	    System.out.println ("------------");

	    BufferedReader inputFile  = new BufferedReader (new FileReader("h:\\word.txt"));
	    
	    BattleNumber              = Integer.parseInt  (inputFile.readLine());
	     
	    System.out.println ("Total of " + BattleNumber + " battles"); 
	     
	    for (int i = 1; i <= BattleNumber; i++){
		PlayerOne = inputFile.readLine();
		PlayerTwo = inputFile.readLine();
	       
		for ( int x = 0; x <=5 ; x++){
		    if ( PlayerOne.charAt(x*2)=='K'){ 
			PlayerOneTHP = PlayerOneTHP + 2; 
		    } 
		    else if ( PlayerOne.charAt(x*2)=='F'){ 
			PlayerOneTHP = PlayerOneTHP + 1;
		    }
		    else if ( PlayerOne.charAt(x*2)=='A'){ 
			PlayerOneTHP = PlayerOneTHP + 4;
		    }
		    else if ( PlayerOne.charAt(x*2)=='T'){ 
			PlayerOneTHP = PlayerOneTHP + 5;
		    }
		    else if ( PlayerOne.charAt(x*2)=='S'){ 
			PlayerOneTHP = PlayerOneTHP + 3;
		    }
		    if ( PlayerTwo.charAt(x*2)=='K'){ 
			PlayerTwoTHP = PlayerTwoTHP + 2; 
		    } 
		    else if ( PlayerTwo.charAt(x*2)=='F'){
			PlayerTwoTHP = PlayerTwoTHP + 1; 
		    }
		    else if ( PlayerTwo.charAt(x*2)=='A'){
			PlayerTwoTHP = PlayerTwoTHP + 4; 
		    }
		    else if ( PlayerTwo.charAt(x*2)=='T'){
			PlayerTwoTHP = PlayerTwoTHP + 5; 
		    }
		    else if ( PlayerTwo.charAt(x*2)=='S'){
			PlayerTwoTHP = PlayerTwoTHP + 3; 
		    }// END OF ELSE IF statement 
		}// END of for loop that calulates that players total hit points
		
		    System.out.println("");
		    System.out.println("Battle " + (i) + " Player 1: " + "Strengh of " + PlayerOneTHP);
		    System.out.println("Battle " + (i) + " Player 2: " + "Strengh of " + PlayerTwoTHP);
		   
		    if (PlayerOneTHP > PlayerTwoTHP){
			System.out.println("Battle " + (i) + " Winner  : " + "Player 1");
		    }//this ends the if statement that calculates which player is the winner 
		    else if (PlayerTwoTHP > PlayerOneTHP){
			System.out.println("Battle " + (i) + " Winner  : " + "Player 2");
		    }// this ends the else if statement that calulates which player is the winner     
		    else if (PlayerOneTHP == PlayerTwoTHP){
			System.out.println("Battle " + (i) + " Winner  : " + "TIE BATTLE");
		    }// this ends the else if statement that calculates if its a tie battle 
		   
		    PlayerOneTHP = 0;
		    PlayerTwoTHP = 0;
	       
	    }//end of for loop that reads in files 
		System.out.println("");
		System.out.println("End of Battles");
		PlayerOneTHP = 0;
		PlayerTwoTHP = 0;

     }// THIS ENDS THE TRY 
	    catch(IOException error){
		System.out.println ("Error Found!!");
		System.out.println (error);
	    }// this ends the catch command that will printout error 
    } // main method
} // BattleGameGH class
