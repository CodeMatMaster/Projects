import java.util.*;
import java.text.DecimalFormat;
public class GrossPayTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DecimalFormat DF = new DecimalFormat("0.000");
		
		
		//Random rand = new Random();
		//int cars;
		
		//cars = rand.nextInt(11);
		//System.out.println(cars);
		
	//	for(int i=0; i<5; i++)
	//	{
		//	cars = rand.nextInt(11);
	//		System.out.print(cars + " |  " );
	//	}
	
	GrossPay2 object = new GrossPay2();
	Scanner in= new Scanner(System.in);
	
	int choice = 5;
	
	while(choice !=2) { 
	object.menu();
	choice=in.nextInt();
	switch(choice)
	{
	case 1:
	{
		object.getInput();
		object.grossPay();
		break;
	}
	case 2: 
	{
		System.out.println("Have a great day!");
		break;
	}
	default:
	{
		System.out.println("Invalid Input. Please enter a valid entry.");
		break;
	}
	
	
	}
	
	
	
	}

}

}