import java.util.*;
public class Lab8Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To complete this lab, you will declare arrays to be filled, searched and displayed as follows:
		//Part 1 Array of 2�s.
		
		//Declare an array of 10 integer values
		int [] values = {1,2,3,4,5,6,7,8,9,10};
		//arr[0]=0;
		//int [] values = new int[10];

		//Declare a different array of 10 integer values. Use a for loop to initialize the values with even numbers from 2-20.
		//Display the values with a separator
		for(int i=0; i<10; i++)  //Index 10 would be out of pounds if i<11 because that is a total of 10 indexes
		{
			System.out.print(values[i] + " | ");
		}
		
		System.out.println();
		System.out.println();
		
		double average = 0; //data type double 
		//int value = 2;  
		int [] evenTwos = new int[10];  //array created
		for(int i=0; i<10; i++)
		{
			//evenTwos[i] = value;
			evenTwos[i]=2*(i+1);
			System.out.print(evenTwos[i] + "  | ");
			
		}
		System.out.println();
		System.out.println();
		
		//Declare an array of 20 int values
		int [] values3 = new int[20] ;
		Random rand = new Random();  //determines a seed value (zero seed) 
		int total = 0;
		for(int i=0; i<20; i++)
		{
			values3[i]=rand.nextInt(41)+10; //41+10   %41+10;
			System.out.print(values3[i] + " |  ");
			total+=values3[i];
			average=total/20;
			
			
		}	
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<20; i++)	
		if(values3[i]%2==0)
			{

				System.out.print(values3[i] + " | ");
			}
		
		
		System.out.println();
		System.out.println();
		
		
		for(int i=0; i<20; i++)	
			if(values3[i]%1==0)
				{

					System.out.print(values3[i] + " | ");
				}
		
		System.out.println();
		System.out.println();
		int high = 0;
		for(int i=0; i<20; i++)	
			if(values3[i]>high)
				{

					high=values3[i];
					
				}
		System.out.println("Highest Value: "+high);
		
		
		System.out.println();
		int low = 100;
		for(int i=0; i<20; i++)	
			if(values3[i]<low)
				{

					low=values3[i];
				}
		System.out.println("Lowest value: " + low);
		
		
	
				
				System.out.println("Total: " + total);
				
				System.out.println("Average: " + average);
			
			
		
		
			
		}
	
		
		
	//	System.out.println();
	//	System.out.println();
		
		
		
		
	}


