import java.util.ArrayList;
import java.util.*;

public class MyArrayList
{
  final static int NUM_ITEMS = 6; //means that array list cannot change


  public static void main(String[] args)
  {
        ArrayList<Integer> a = new ArrayList<Integer>();


        fillUp (a);


        System.out.println(a);


        System.out.println("\nArrayList Sum :  " + sumUp(a));
        System.out.println("Num of Positive Values :  " + posCount(a));
  }


  private static void fillUp (ArrayList<Integer> a)
  {
        // TODO:  Insert your loop here
	  Scanner in = new Scanner(System.in);
	  for(int i=0; i<NUM_ITEMS; i++)
	  {
		  System.out.println("Enter an integar");
		 // add(in.nextInt())
		  
	  }



  }


    private static int sumUp (ArrayList<Integer> a)
  {
        // TODO:  Insert your loop here
    		int sum=0;
    		for(int n: a)
    		{
    			sum+=n;
    		}

     //  Dummy line   
    // return 0;
    	return sum;
  }


  private static int posCount (ArrayList<Integer> a)
  {
        // TODO:  Insert your loop here
	 int posCount=0;
	  for(int n:a) {
		  if(n>0)
		  {
		  posCount++;
		  }
	  }

     //  Dummy line   
     //return 0;
	  return posCount;
  }
}
