import java.util.*;
public class GrosspayTester {

	public static void main(String[] args) {
		
		Grosspay object = new Grosspay();
		Scanner in = new Scanner(System.in);
		
		
		
		int choice = 5;
		
		//object.menu();
		//choice =in.nextInt();
		
		choice = 5;  //do not duplicate variables
		
		while (choice !=2)
		{
		object.menu();
		choice =in.nextInt();
		switch(choice)
		{
		case 1:
		{
		object.getInput();
		object.computePay();
		break;		
		}
		case 2:
		{
		System.out.println("Thank you for your hard work!!!");
		break;
		}
		
		default:
		{
			System.out.println("Invalid Input. Try Again");
		}
		
		}
	}

}

	
}