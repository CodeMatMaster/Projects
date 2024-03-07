import java.util.*;
public class BMICalculatorTester {

	public static void main(String[] args) {
		// the class name is the template for the type of object we want to create
		
		Scanner in = new Scanner(System.in); //What does system in mean again ?
		BMICalculator object = new BMICalculator();  //creates in BMICalculator object
		
		//object.menu();
		int choice = 9;
		
		while(choice != 3)
		{
			object.menu();
			choice=in.nextInt();
			switch (choice)
		{
			case 1:
			{
				object.getData();
				object.computeBMI();//method getData used to get height and weight 
				object.healthStatus();
				
				break;
			}
			case 2:
			{
				object.loadBMI();
				
			}
		
		
		}
		
		
		
		}
		
	}

}
