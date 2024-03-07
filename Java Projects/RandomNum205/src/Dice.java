import java.util.*;
//import java.random.*;
import java.util.Random; // Random Library in Java
import java.util.Arrays;
//However, you can make random numbers in Java with just the Math Class

public class Dice {

	public static void main(String[] args) {
		
		
		//Random dice = new 
		//double dice = (int)(Math.random())*6;
		
		for(int i =0; i<50; i++)
		{
			double dice = (int)(Math.random()*6+1);
			System.out.println(dice);
			
		}
		
		// TODO Auto-generated method stub
		
		
		//String car[] = {"BMW" , "Honda" , "Lamborghini"};
		
		// What is the difference between Array and Arraylist?
		
		
		int cars[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(cars));
		int size = 4;
		int pos = 2;
		size++;
		
		for(int i = size - 1; i > pos; i--)
		{
			cars[i] = cars[i-1];
		}
		
		System.out.println(Arrays.toString(cars));
		
		num(3);
		
		nums(3);
		
		System.out.println(num(3));
		
		
		System.out.println(nums(3));
		
		
		//cars++;
		
		
		//for(int i = size-1; i>car[i]; i--)
		//{
			
		//}
		

	}
	
	public static int num(int n){
		int total = 0;
			for(int i = 1; i<n; i++)
			{
			if(i == 0)
			{
				i = 1;
				total*=i;
			}
				total*=i;
			} // end of for loop
		return total;
		} // end of num method
	
	public static int nums(int n) {
	    int total = 1;

	    for (int i = 1; i <= n; i++) {
	        total *= i;
	    }

	    return total;
	}
	



}

	