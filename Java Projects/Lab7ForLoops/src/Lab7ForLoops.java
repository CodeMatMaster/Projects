import java.util.*;

 
public class Lab7ForLoops {

	public static void main(String[] args) 
	{
	  //#1 Output a word or phrase length() number of times 
		Scanner in = new Scanner(System.in);
		String pharse="";
		//prompt for user input for a word or pharse
		System.out.println("Enter a word or pharse: ");
		//get input
		pharse=in.nextLine();
		//display the word or phrase length-1 times
		for (int i=0; i<pharse.length(); i++ )  //i is declared locally in this for loop
		{
			System.out.println(pharse);
		}
		//#2 Start at 2, stop by 90, increment by 5
		for(int i=2; i<90; i+=5)
		{
			System.out.print(i+ ", ");
		}
		System.out.println();
		//#3 start at 5 stop by 30 increment by 2
			for (int i=5; i<=30; i+=2)
		{
			System.out.print(i + ", ");
		}
	System.out.println();
	System.out.println("\nEnter a max for multiple table: ");
	int max=in.nextInt();
		for (int i=1; i<=10; i++)
		{
			System.out.println(i + "\t" + (i*max));
		}
				
	}

}









/*
 * 
 * int rows, cols;
 * Scanner in =newScanner(System.in)
 * SOP("Enter a word or pharse: ")
 * String pharse =in.nextLine();
 * 
 * for(int i = 0; pharse.length();i++)
 * {
 * 
 *		sysout (pharse) 
 * 
 * 	}
 * 
 * 
 * 
 * 
 * 
 * 
 */