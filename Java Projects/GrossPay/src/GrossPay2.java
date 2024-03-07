import java.util.*;
public class GrossPay2 {

private double payrate;
private double hours;
private double overtimeFormula;
private double overtime;
private double paycheck;
private double newpay;


Scanner in = new Scanner(System.in);


	public GrossPay2()
	{
			payrate=0;
			hours=0;
	}
	
	
	public void getInput()
	{
		System.out.println("How many hours did you work this week ?");
		hours=in.nextDouble();
		
		System.out.println("What is your PayRate?");
		payrate=in.nextDouble();
	}
	
	public double displayHours()
	{
		return hours;
	}
	
	public double displayPayRate()
	{
		return payrate;
	}

	
	public void computeOvertime()
	{
		overtimeFormula=(1.5*payrate)*(overtime-40);
	}
	
	
	public void menu()
	{
		System.out.println("Menu Options:");
		System.out.println("1.) Log in hours and pay");
		System.out.println("2.) Exit");
	}

	public void grossPay()
	{
		if (hours < 40)
	{
		paycheck=hours*payrate; 
		System.out.println("Your paycheck for this week is: " + paycheck );
	}	
		
	else if (hours>40){
		paycheck=40*payrate;
		overtimeFormula=(1.5*payrate)*(hours-40);
		System.out.println("Your overtime hours is as follows: " + overtimeFormula);
		newpay=overtimeFormula+paycheck;
		System.out.println("Your paycheck for this week is: " + newpay);
	}
	
		
	
	
}
	
	

}
