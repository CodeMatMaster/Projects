import java.util.*;
public class Grosspay {
		
private int choice1;
private double hours;
private double pay;
private double ratePay;
private double total;
private double overtime;
private double grossPay;



Scanner in = new Scanner(System.in);

	public Grosspay()
	{
		ratePay=1.5;
		pay=0;
		hours=0;
		
		
	}
	
	
	
	public void menu()
	{
		System.out.println("Log in your hours! Options are as follows:");
		System.out.println("1.) Enter number of hours worked");
		System.out.println("2.) Exit");
		
		
	}
	
	
	public void  getInput()
	{
		System.out.println("What is your hourly pay rate?");
		pay=in.nextDouble();
		
		System.out.println("How many hours did you work this week?");
		hours=in.nextDouble();
		
	}
	
	public void computePay()
	{
		if (hours <=40)
		{
			total=hours*pay;
			System.out.println("Your gross pay is " + total);
		}
		
		
		else if(hours > 40)
		{
			total=40*pay;
			overtime=(hours-40)*(pay*1.5);
			grossPay=total+overtime;
		//	overtime=hours-40;
			System.out.println("Your overtime hours is " + overtime);
		//	ratePay=overtime*1.5;
		//	System.out.println("Overtime pay is equal to " + ratePay);
		//	grossPay=total+overtime;
			System.out.println("Your final gross pay is: " + grossPay);
		}
	}
	
	
	
}
