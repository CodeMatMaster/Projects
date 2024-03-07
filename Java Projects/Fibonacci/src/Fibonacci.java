import java.util.*;
public class Fibonacci {

//int intArray[];
//intArray = new int[20]; 
	
//int[] intArray = new int[20]; //combining both statements
	
private int[] fibNums;



//constructor
public Fibonacci(int size) //passing in a value for fibNums
{
	setFibo(size);
	
}
//a method to convert the array object to a string
public String toString()
{
	String output="";
	 for(int i=0; i<fibNums.length; i++)
	 {
		 output+=i+"-"+fibNums[i]+"\n";
	 }
	 	return output;
}

public void setFibo(int size)

{

      //instantiate the array instance variable with the size.
		fibNums=new int[size];
	

       //solve for the fibonacci values

}

}
