
//nececssary imported libraies
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;

public class Bingo2
{
public static int bingoCard[][]; 

// instance variables
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

//  private int id;
//  private static int personCount =0;

// Counstructor
public Bingo2()
  {
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


public static void fillCard()
  {
     try{
          Scanner in = new Scanner(new File("bingo.in"));

         for (int j = 0;  j < Bingo.bingoCard.length;  j++)
      for (int k = 0;  k < Bingo.bingoCard[0].length;  k++)
                   Bingo.bingoCard[j][k] = in.nextInt();
    }
    catch (IOException e)  {
           System.out.println(e.getMessage());
    }
  }









  public static void printCard() {
          // Print column headers
          System.out.println();
          System.out.println("  B    I    N    G    O");
          System.out.println("--------------------------");

          // Print each row of the Bingo card
          for (int i = 0; i < bingoCard.length; i++) {
              System.out.print("| ");
              for (int j = 0; j < bingoCard[i].length; j++) {
                  System.out.print(bingoCard[i][j] + " | ");
              }
              System.out.println("\n--------------------------");
          }
      System.out.println();
      } // end of printCard Method












    //int calledNum;

   //Bingo.count = 0;
    public static void playGame(){
  //  ArrayList<Integer> collectedCalledNumbers = new ArrayList();


      while (true) {
        int randomNumber = (int) (Math.random() * 75) + 1;


        // calledNumbers is the bitset

        if(!calledNumbers.get(randomNumber)){
          calledNumbers.set(randomNumber);
          collectedCalledNumbers.add(randomNumber);
          if (calledNumbers.get(randomNumber)) {
            markCard(bingoCard, randomNumber);
          }

         // printBingoCard(bingoCard);

        //  System.out.println("The next number is: " + randomNumber);
          count++;
        }


      //  checkWin(bingoCard);
        int result = checkWin(bingoCard);
        if (result != 0) {
           // System.out.println("Winner: " + result);





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





        //calledNumbers.set(randomNumber); //now keep track of called number

        /*
        do {
            randomNumber = (int) (Math.random() * 75) + 1;

            System.out.println("The next number is: " + randomNumber);
            // calledNumbers.set(randomNumber) ;// Generate random number between 1 and 15 for 'B'
          } while (collectedCalledNumbers.contains(randomNumber)); // Check if the number is already in the list
          collectedCalledNumbers.add(randomNumber); // Add unique number to the 

          //break;


       }
        */  //bingoCard[i][0] = B; // Assign the new number to the 'B' column

      } // end of while loop
    }
  public static int checkWin(int bingoCard[][]) {
//Local Variable
  int result = 0;


      for (int i = 0; i < 5; i++) {
         // System.out.println("hsm " + hsum);
    hsum = 0;
        for (int j = 0; j < bingoCard[i].length; j++)
            hsum += bingoCard[i][j];
        if (hsum == -5) {
            return HORIZONTAL;
        }
    } // end of for loop

      for (int i = 0; i < 5; i++) {
        //  System.out.println("Vsm" + vsum);
          vsum = 0;
          for (int j = 0; j < bingoCard[i].length; j++)
              vsum += bingoCard[j][i];
          if (vsum == -5) {
              return VERTICAL;
          }
      } // end of for loop

      // First Diagonal
      dsum = 0;
      for (int i = 0; i < bingoCard.length; i++) {
          dsum += bingoCard[i][i];
      }
      if (dsum == -5)
          return DIAGONAL;

      dsum2 = 0;
      // Second Diagonal
      for (int i = 0; i < bingoCard.length; i++) {
          dsum2 += bingoCard[i][bingoCard.length - i - 1];
       //   System.out.println("Diagonal " + dsum2);
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


    // Which Type of Winner 

    //int result1 = checkWin(bingoCard);

   // if (result == HORIZONTAL) {
    // System.out.println("Horizontal Winner");
    //  System.out.println("Bingo! You Win the game!");
  //    System.out.println("hsum: " + hsum);
       // System.out.println("vsum: " + vsum);
       // System.out.println("dsum1: " + dsum);
       // System.out.println("dsum2: " + dsum2);
  //  } else if (result == VERTICAL) {
       // System.out.println("Vertical Winner");
       // System.out.println("Bingo! You Win the game!");
       // System.out.println("hsum: " + hsum);
       // System.out.println("vsum: " + vsum);
       // System.out.println("dsum1: " + dsum);
       // System.out.println("dsum2: " + dsum2);
  //  } else if (result == DIAGONAL) {
       // System.out.println("Diagonal Winner");
       // System.out.println("Bingo! You Win the game!");
       // System.out.println("hsum: " + hsum);
       // System.out.println("vsum: " + vsum);
       // System.out.println("dsum1: " + dsum);
       // System.out.println("dsum2: " + dsum2);;

  //  }
    /*
    // Check if any win condition is met
    if (result1 != 0) {
      System.out.println("Bingo! You Win the game!");
      System.out.println("hsum: " + hsum);
      System.out.println("vsum: " + vsum);
      System.out.println("dsum1: " + dsum);
      System.out.println("dsum2: " + dsum2);
     // Break out of the loop
    }
    */

    return result;
      //return 0;
  } // end of checkWin method

         // end of Method



        //printBingoX(bingoCard);
       // int result = checkForWin(bingoCard); // Store the result of checkForWin
       // markCard(bingoCard, randomNumber);




  public static void markCard(int[][] bingoCard, int number) { // method to markCard with -1
      for (int i = 0; i < bingoCard.length; i++) {
          for (int j = 0; j < bingoCard[i].length; j++) {
              if (bingoCard[i][j] == number) {
                  bingoCard[i][j] = -1; // Mark the drawn number with -1 (or any other placeholder value)
                  return; // Stop searching after marking the number
              }
          }
      }
  }


 /* public static void printBingoX(int[][] bingoCard) { // Method to Print X
    System.out.println("B  I  N  G  O");
    System.out.println("--------------------------");
      for (int i = 0; i < 5; i++) {
        System.out.print("| ");
          for (int j = 0; j < 5; j++) {
              if (bingoCard[i][j] == -1) {
                  System.out.print("X |"); // Print "X" for marked numbers
              } else {
                  System.out.print(bingoCard[i][j] + "\t"); // Print the number
              }
          }
          System.out.println(); // Move to the next line after printing each row
      }
  }  */


  public static void printBingoX(int[][] bingoCard) {
      System.out.println(" B    I    N    G    O");
      System.out.println("-----------------------");
      for (int i = 0; i < 5; i++) {
          System.out.print("| ");
          for (int j = 0; j < 5; j++) {
              if (bingoCard[i][j] == -1) {
                  System.out.print("X | "); // Print "X" for marked numbers
              } else {
                  System.out.print(bingoCard[i][j] + " | "); // Print the number
              }
          }
          System.out.println("\n-----------------------");
      }
  }




  public static void printBingoCard(int myArray[][]) {
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < myArray[i].length; j++) {
              System.out.print(myArray[i][j] + "\t");
          }
          System.out.println();
      }
  }  // end of printBingoCard Method

/*
public static void printCalledNumber(int calledNum[][])
  {
  System.out.println("Called Numbers: ");
  for

  }
*/

  /*
  public static void printCalledNumbers(ArrayList<Integer> calledNumbers) {
      System.out.println("Called Numbers:");
      int count = 0;
      for (Integer number : calledNumbers) {
          System.out.print(number + "  ");
          count++;
          if (count % 10 == 0) {
              System.out.println(); // Add a new line after every 10 numbers
          }
      }
      System.out.println(); // Add a new line for clarity
  }
*/

  public static void printCalledNumbers(ArrayList<Integer> calledNumbers) {
      System.out.println("BINGO NUMBERS PICKED AT RANDOM FROM BIN :");
      int count = 0;
      for (Integer number : calledNumbers) {
          System.out.print(number + "  ");
          count++;
          if (count % 10 == 0) {
              System.out.println(); // Add a new line after every 10 numbers
          }
      }
      System.out.println("\n"); // Add a new line for clarity

    System.out.println("YOU WIN WITH A " + winType + " BINGO AFTER "+ count + " PICKS!\n"); 

    System.out.println("YOUR BINGO CARD :\n");
  }







  public static void createBingoCard() {
      ArrayList<Integer> collectedNumbers = new ArrayList<>();
      // Generate and print random numbers for 'B' (1-15)
      for (int i = 0; i < 5; i++) {
          int newNumber;
          do {
              newNumber = (int) (Math.random() * 15) + 1; // Generate random number between 1 and 15 for 'B'
          } while (collectedNumbers.contains(newNumber)); // Check if the number is already in the list
          collectedNumbers.add(newNumber); // Add unique number to the list
          bingoCard[i][0] = newNumber; // Assign the new number to the 'B' column
      }

      // Generate and print random numbers for 'I' (16-30)
      for (int i = 0; i < 5; i++) {
          int newNumber;
          do {
              newNumber = (int) (Math.random() * 15) + 16; // Generate random number between 16 and 30 for 'I'
          } while (collectedNumbers.contains(newNumber)); // Check if the number is already in the list
          collectedNumbers.add(newNumber); // Add unique number to the list
          bingoCard[i][1] = newNumber; // Assign the new number to the 'I' column
      }

      // Generate and print random numbers for 'N' (31-45)
      for (int i = 0; i < 5; i++) {
          int newNumber;
          do {
              newNumber = (int) (Math.random() * 15) + 31; // Generate random number between 31 and 45 for 'N'
          } while (collectedNumbers.contains(newNumber)); // Check if the number is already in the list
          collectedNumbers.add(newNumber); // Add unique number to the list
          bingoCard[i][2] = newNumber; // Assign the new number to the 'N' column
      }

      // Generate and print random numbers for 'G' (46-60)
      for (int i = 0; i < 5; i++) {
          int newNumber;
          do {
              newNumber = (int) (Math.random() * 15) + 46; // Generate random number between 46 and 60 for 'G'
          } while (collectedNumbers.contains(newNumber)); // Check if the number is already in the list
          collectedNumbers.add(newNumber); // Add unique number to the list
          bingoCard[i][3] = newNumber; // Assign the new number to the 'G' column
      }

      // Generate and print random numbers for 'O' (61-75)
      for (int i = 0; i < 5; i++) {
          int newNumber;
          do {
              newNumber = (int) (Math.random() * 15) + 61; // Generate random number between 61 and 75 for 'O'
          } while (collectedNumbers.contains(newNumber)); // Check if the number is already in the list
          collectedNumbers.add(newNumber); // Add unique number to the list
          bingoCard[i][4] = newNumber; // Assign the new number to the 'O' column
      }
  }




  



 // end of Bingo Class


//
  

 // Bingo.printCalledNumbers(collectedCalledNumbers);

  //Bingo.printCalledNumbers(collectedCalledNumbers);
  //Bingo.checkWin(Bingo.bingoCard);
  //Bingo.checkWin(Bingo.bingoCard[][]);




  } // End of Main Method

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }








/*
int B = (int) (Math.random() * 15) + 1;

int I = (int) (Math.random() * 15) + 16;
  int N = (int) (Math.random() * 15) + 31;
  int G =  (int) (Math.random() * 15) + 46;
  int O = (int) (Math.random() * 15) + 61;




for (int i = 0; i < 5; i++) {
 // int newNumber;
  do {
     B = (int) (Math.random() * 15) + 1; // Generate random number between 1 and 15 for 'B'
  } while (collectedNumbers.contains(B)); // Check if the number is already in the list
  collectedNumbers.add(B); // Add unique number to the list
  bingoCard[i][0] = B; // Assign the new number to the 'B' column
}



// Generate and print random numbers for 'I' (1-15)
for (int i = 0; i < 5; i++) {
 // int newNumber;
  do {
     I = (int) (Math.random() * 15) + 1; // Generate random number between 1 and 15 for 'B'
  } while (collectedNumbers.contains(I)); // Check if the number is already in the list
  collectedNumbers.add(I); // Add unique number to the list
  bingoCard[i][1] = I; // Assign the new number to the 'I' column
}

System.out.println("These are my nums: ");
printBingoCard(bingoCard);


// Generate and print random numbers for 'N' (1-15)
for (int i = 0; i < 5; i++) {
 // int newNumber;
  do {
     N = (int) (Math.random() * 15) + 31; // Generate random number between 1 and 15 for 'N'
  } while (collectedNumbers.contains(N)); // Check if the number is already in the list
  collectedNumbers.add(N); // Add unique number to the list
  bingoCard[i][2] = N; // Assign the new number to the 'N' column
}

System.out.println("These are my nums: ");
printBingoCard(bingoCard);




// Generate and print random numbers for 'G' (1-15)
for (int i = 0; i < 5; i++) {
 // int newNumber;
  do {
      G =  (int) (Math.random() * 15) + 46;; // Generate random number between 1 and 15 for 'G'
  } while (collectedNumbers.contains(G)); // Check if the number is already in the list
  collectedNumbers.add(G); // Add unique number to the list
  bingoCard[i][3] = G; // Assign the new number to the 'G' column
}

System.out.println("These are my nums: ");
printBingoCard(bingoCard);


// Generate and print random numbers for 'O' (1-15)
for (int i = 0; i < 5; i++) {
 // int newNumber;
  do {
     O = (int) (Math.random() * 15) + 61; // Generate random number between 1 and 15 for 'G'
  } while (collectedNumbers.contains(O)); // Check if the number is already in the list
  collectedNumbers.add(O); // Add unique number to the list
  bingoCard[i][4] = O; // Assign the new number to the 'G' column
}

System.out.println("These are my nums: ");
printBingoCard(bingoCard);







*/



