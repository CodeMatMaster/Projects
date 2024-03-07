import java.util.*;
import java.util.Scanner;



public class Stats {
  public static void main(String[] args) {
    int[] myList = new int[100]; // You can adjust the size based on your needs
    int size = fillUp(myList);
    System.out.println("Size of the array: " + size);

    int rangeValue = range(myList, size);
    System.out.println("Range of the array: " + rangeValue);

    int meanValue = mean(myList, size);
    System.out.println("Mean of the array: " + meanValue);
    


    
  }
  private  static int fillUp (int[] List)
  {
    int n = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Please Input Your Values (Enter a 0 to Stop)");

    while(true)
    {
      List[n] = in.nextInt();

      if (List[n] == 0)
        break;
      n++;
    }
    return n;
  } // end of fillUp method


  private static int range(int[] List, int numItems)
  {
    int max = List[0];
    int min = List[0];

    for (int i = 0; i < numItems; i++)
      {
        if (List[i] > max)
          max = List[i];
        if (List[i] < min)
          min = List[i];
      }
    return max - min;
  }

  private static int mean(int[] List, int numItems)
  {
    int sum = 0;
    for (int i = 0; i < numItems; i++)
      {
        sum += List[i];
      }
    return sum / numItems;
  }
  

  


  
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}