import java.text.DecimalFormat;  //imported decimal format
import java.util.*;
public class BMICalculator
{
	private double height;
	private double height2;
	private double weight;
	private int numValues;
	private double records[];
	//private int choice1;
	private double BMI;
	private double average;
	
	Scanner in = new Scanner (System.in);


	
	
	public BMICalculator()
	{
		height = 0;
		weight = 0;
		//numValues=in.nextInt();  //the program won't run if that is not operating for some reason
		//records=double[];
		BMI= 0;
		//numValues=in.nextInt();
	}
	
	DecimalFormat DF = new DecimalFormat("0.000"); 
	
	public void menu()
	{
		System.out.println("Welcome to the Body Mass Index (BMI) Evaluation");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("Body Mass Index (BMI) Range: ");
		System.out.println("18.4 and under: Underweight");
		System.out.println("18.5 - 24.9 = Normal");
		System.out.println("25.0 - 29.9: Overweight");
		System.out.println("30.0 and above: Obese.");
		
		System.out.println();
		System.out.println();
		
		System.out.println("************************************************");
		
		System.out.println();
		
		System.out.println("1.) Find Individual BMI");
		System.out.println("2.) Find Group BMI");
		System.out.println("3.) Exit");
	}
	
	
	
	public void getData()
	{
		System.out.println("Enter a weight: ");
		weight =in.nextDouble();
		
		System.out.println();
		
		System.out.println("Enter a height (enter in feet first) ");
		height = in.nextDouble();
		
          System.out.println("Enter a height (now enter height in inches): ");
		height2=in.nextDouble();
				
		//Convert Feet to Inches
		height = height * 12; 
				
		height = height+height2;
		
	}
	
	public void printBMI()
	{
		for(int i=0; i<records.length; i++)
		{
			System.out.println(records[i] +  "  |  ");
		}
		System.out.println();
	}
	
	

	
	public void computeBMI()
	{
		BMI = weight / Math.pow(height, 2) * 703;   //height is raised to the second power
		System.out.println("Your BMI is: " + DF.format(BMI));
	
	
	}
	
	public void average()  //for average BMI   I did not use this method in the program 
	{
		System.out.println("How many records do you want to create: ");
		numValues=in.nextInt();
		records=new double[numValues];
		for(int i=0; i<numValues; i++)
		{
			System.out.println("Enter a weight: (Feet)");
			height=in.nextDouble();
			
		//	System.out.println("Enter a height (Inches): ");
		//	height2=in.nextDouble();
			
			// Convert Feet to Inches
			//height = height * 12; 
			
		//	height = height+height2;
			
			
			
			
			
			
			
			System.out.println("Enter a weight: ");
			weight=in.nextDouble();
			
			BMI = weight / Math.pow(height, 2) * 703;
			System.out.println(numValues + "BMI is :" + BMI);
			
			
		}
	}
		
	public void loadBMI()
	{
		double total=0;
		System.out.println("How many records do you want to create: ");
		numValues=in.nextInt();
		records =new double[numValues];

		for(int i=0; i<numValues; i++)
		{
			
			System.out.println("Enter a weight: ");
			weight =in.nextDouble();
			
			System.out.println("Enter a height (enter in feet first): ");
			height=in.nextDouble();
			
			System.out.println("Enter a height (now enter in inches): ");
			double height2=in.nextDouble();
			
			// Convert Feet to Inches
			height = height * 12; 
			
			//Add all Inches
			height = height+height2;
			
			
			BMI = weight / Math.pow(height, 2) * 703;
			
			records[i]= BMI;
			
			total+=records[i];
		}
			//System.out.println(records);		
		
		for(int i=0; i<records.length; i++)
		{
			
			//System.out.println("The groups BMI: " + DF.format(BMI));
			System.out.print(DF.format(records[i]) + "   |   ");
		}
		System.out.println();
		
		average= total/numValues;
		System.out.println("This group BMI average is: " + DF.format(average));
		
		

		
		
		
		
		
		
	}
	
	
	public void groupHealthStatus() //this method is only for average
	{
		BMI = weight / Math.pow(height, 2) * 703; 
		if (average <= 18.4 )
		{
			System.out.println("Health condition of the group: Underweight");
		}
		
		
		else if (average >= 25.0 && BMI <= 29.9)
		{
			System.out.println("Health condition of the group: Overweight");
		}
	
		else if(average >= 18.5 && BMI <= 24.9 )
		{
			System.out.println("Health condition of the group: Normal.");
		}
		
		else if(average >= 30 )
		{
			System.out.println("Health condition of the group: Obese");
		}
		
		else 
		{
			System.out.println("Error. Bad input.");
		}
	}
	
	
	
	
	public void healthStatus()
	{
		BMI = weight / Math.pow(height, 2) * 703; 
		if (BMI <= 18.4 )
		{
			System.out.println("Underweight");
		}
		
		
		else if (BMI >= 25.0 && BMI <= 29.9)
		{
			System.out.println("Overweight");
		}
	
		else if(BMI >= 18.5 && BMI <= 24.9 )
		{
			System.out.println("Normal");
		}
		
		else if(BMI >= 30 )
		{
			System.out.println("Obese");
		}
		
		else 
		{
			System.out.println("Error. Bad input.");
		}
	
	}
	


	
	
	
	
	
	
}






























