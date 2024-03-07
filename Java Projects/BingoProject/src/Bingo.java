// Imported Libraries 
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;


public class Bingo {
public static int bingoCard[][];

public static int vsum;
public static int hsum;
public static int dsum;
public static int dsum2;
public static final int HORIZONTAL = 1;
public static final int VERTICAL = 2;
public static final int DIAGONAL = 3;
public static String winType;
public static BitSet calledNumbers;
public static int count;
public static ArrayList<Integer> collectedCalledNumbers;


// Constructor For Bingo: Initializes the bingoCard and other important class variables
public Bingo(){
    Bingo.vsum = 0;
    Bingo.hsum = 0;
    Bingo.dsum = 0;
    Bingo.dsum2 = 0;
    Bingo.bingoCard = new int[5][5];
    calledNumbers = new BitSet(76);
    Bingo.count = 0;
    winType = "";
    collectedCalledNumbers= new ArrayList();

  }

/*
 * Precondition: input file "bingo.in" must exist and possess integers to be passed into the bingo card.
 *
 * Postcondition: This void method fills the array 'bingoCard' from the input file.
 */

//I need to ask why I can't just use 
public static void fillCard()
  {
     try{
          Scanner in = new Scanner(new File("/Users/mj/Desktop/CSC 205/BingoProject/bin/bingo.txt"));

         for (int j = 0;  j < Bingo.bingoCard.length;  j++)
      for (int k = 0;  k < Bingo.bingoCard[0].length;  k++)
                   Bingo.bingoCard[j][k] = in.nextInt();
    }
    catch (IOException e)  {
           System.out.println(e.getMessage());
    }
  }




/*
 * Precondition: None, because this method do not necessarily require specfic conditons to be met before executed.
 *
* Postcondition: Prints bingo card array to be displayed in the console for visual appearance at the beginningof the program.
*
 */
public static void printCard() {
System.out.println("YOUR BINGO CARD :");
System.out.println();
          System.out.println("  B    I    N    G    O");
          System.out.println("--------------------------");


for (int i = 0; i < bingoCard.length; i++) {
              System.out.print("| ");
              for (int j = 0; j < bingoCard[i].length; j++) {
                  System.out.print(bingoCard[i][j] + " | ");
              }
              System.out.println("\n--------------------------");
          }
      System.out.println();



}

/*
  *  Precondition: The bingoCard array must be filled all numbers from the input file.

*  Postcondition: Begins the Bingo Game until the numbers called match the playing card either Horizontally, Vertically, or Diagonially. BitSet callNumbers is used to ensure there not any repeated numbers.
 */
 public static void playGame(){
 while (true) {
        int randomNumber = (int) (Math.random() * 75) + 1;


if(!calledNumbers.get(randomNumber)){
          calledNumbers.set(randomNumber);
          collectedCalledNumbers.add(randomNumber);
          if (calledNumbers.get(randomNumber)) {
            markCard(bingoCard, randomNumber);
          }

  count++;
        }


 int result = checkForWin(bingoCard);
        if (result != 0) {




            if(result == 1)
            winType = "HORIZONTAL";
            else if(result == 2)
            winType = "VERTICAL";
            else if (result == 3)
            winType = "DIAGONAL";
            break;
            }




            if(count == 75)
            {
              System.out.println("All Numbers Have Been Called");
              break;
            }



     }


     } // end of while loop



    /*
     * Method used to determine if a win is found on the card after each number randomly called.
     * Precondition: The bingo card must be filled and random number must have already been called.
     * Additionally, the bingoCard array must be passed into the parameters. 
     *
     * Postcondition: Method returns the type of win may be present (HORIZONTAL, VERTICAL, DIAGONIAL) or
     * just simply return the number 0  to indicate the game must continue.  
     *
     */
    public static int checkForWin(int bingoCard[][]) {
      int result = 0;

     for (int i = 0; i < 5; i++) {
     hsum = 0;
              for (int j = 0; j < bingoCard[i].length; j++)
                  hsum += bingoCard[i][j];
              if (hsum == -5) {
                  return HORIZONTAL;
              }
          }




    for (int i = 0; i < 5; i++) {
    vsum = 0;
              for (int j = 0; j < bingoCard[i].length; j++)
                  vsum += bingoCard[j][i];
              if (vsum == -5) {
                  return VERTICAL;
              }
              
    }
    
    
    
    
    dsum = 0;
    for (int i = 0; i < bingoCard.length; i++) {
        dsum += bingoCard[i][i];
    }
    if (dsum == -5)
        return DIAGONAL;


dsum2 = 0;


for (int i = 0; i < bingoCard.length; i++) {
        dsum2 += bingoCard[i][bingoCard.length - i - 1];





if (dsum2 == -5)
            return DIAGONAL;
    }

    for (int i = 0; i < bingoCard.length; i++) {
        vsum = 0;
        for (int j = 0; j < bingoCard[i].length; j++)
            vsum += bingoCard[j][i];
        if (vsum == -5) {
            return VERTICAL;
        }
    }

  return result;
}



public static void markCard(int[][] bingoCard, int number) {
for (int i = 0; i < bingoCard.length; i++) {
        for (int j = 0; j < bingoCard[i].length; j++) {
            if (bingoCard[i][j] == number) {
                bingoCard[i][j] = -1;

return;

              }
        }
    }
}




/*
 * This method is used to replace the called numbers of '-1' to become a 'X' to the console.
 *
 * Precondition: The bingoCard array passed in must be initialized with integer values.
 * Thus, as previously mentioned, all '-1' values are replaced with 'X' when bingo game is over
 * and displayed to the console for the player to see.
 *
 * Postcondition: Method prints the completed bingo card while updating the called randomed selected
 * numbers accordingly. With the nested for loops and if and else statement, the code resets after each
 * row to continue printing and formating the code accordingly. 
 *
 *
 */
public static void printBingoX(int[][] bingoCard) {
      System.out.println(" B    I    N    G    O");
      System.out.println("-----------------------");
      for (int i = 0; i < 5; i++) {
          System.out.print("| ");
          for (int j = 0; j < 5; j++) {
              if (bingoCard[i][j] == -1) {
                  System.out.print("X | ");



} else {
                  System.out.print(bingoCard[i][j] + " | ");


 }
          }
          System.out.println("\n-----------------------");
      }
  }




/*
 * Method just prints filled bingoCard array. This method was used during testing to determine if 
 * card was being updated after each bingo number off the playing card.
 *
 *  Precondtion: The bingoCard array must be filled and passed into the parameters of this method.
 *  Postcondtion: The bingoCard is printed in a 5 by 5 matrix display.
 */
public static void printBingoCard(int myArray[][]) {
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < myArray[i].length; j++) {
              System.out.print(myArray[i][j] + "\t");
          }
          System.out.println();
      }
  }




/*
 * Precondition: Method requires ArrayList of called numbers 
 * Postcondition: The method formats and prints out the called numbers leading up to the bingo and 
 * prints the type of win the bingo is. Lastly, the bingo prints up to 10 numbers on each line and then
 * proceeds to the next line. 
 *
 */
public static void printCalledNumbers(ArrayList<Integer> calledNumbers) {
      System.out.println("BINGO NUMBERS PICKED AT RANDOM FROM BIN :");
      int count = 0;
      for (Integer number : calledNumbers) {
          System.out.print(number + "  ");
          count++;
          if (count % 10 == 0) {
              System.out.println();


}
      }
      System.out.println("\n");

System.out.println("YOU WIN WITH A " + winType + " BINGO AFTER "+ count + " PICKS!\n");

    System.out.println("YOUR BINGO CARD :\n");
}





} // end of Bingo Class
