import java.util.*;
public class RateOfPay {

	public static void main(String[] args) {
		
		//learn to practice writing a constructor
		
		ArrayList<Double>rate;
		rate= new ArrayList<Double>();
		
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter a rate of pay :");
			rate.add(in.nextDouble());
		}
		
		for(double i: rate)
		{
			System.out.print(i + " | ");
		}
		System.out.println();
		
		
		
		//Second Array List
		ArrayList<Double>hours; //declared array list
		hours= new ArrayList<Double>();
		
		System.out.println();
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter hours worked: ");
			hours.add(in.nextDouble());
		}
		
		
		for(double i: hours)
		{
			System.out.print(i + " | ");
		}
		System.out.println();
		
		
		
		
		//Third ArrayLIst
		List<Double>gross;
		gross=new ArrayList<Double>();
		
		System.out.println();
		
		for(int i=0; i<3; i++)
		{
			gross.add(rate.get(i)*hours.get(i));
		}
		
		for(double n: gross)
		{
			System.out.print( "$"+n + "  |  ");
		}
		
		System.out.println();
		
		
		
		
	}

}
