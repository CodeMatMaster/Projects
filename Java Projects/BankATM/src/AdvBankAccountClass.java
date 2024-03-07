import java.util.*;
public class AdvBankAccountClass 

{
	private double chkBal;
	private double savBal;
	private boolean hasChk;
	private boolean hasSav;
	
	
	public AdvBankAccountClass()
	{
		chkBal=0.0;
		savBal=0.0;
		hasChk=false;
		hasSav=false;
	}
	

	public void depositChk(double amount)
	{
		chkBal= chkBal+amount; 
		System.out.println("Your checking account now has a balance of: $" +chkBal);
	}

	public void withdrawChk(double amount)
	{
		if(chkBal<=amount)
		{	
			System.out.println("Incificent funds in your checking account. Please try again.");	
			System.out.println("Your Checking Balance is : $" + chkBal);
		}
		if(chkBal>=amount)
		{
			chkBal=chkBal-amount;
			System.out.println("Your checking account now has a balance of: $" + chkBal);
		}	
	}
	public double getSavBal(double amount)
	{
		return savBal;
	}
	public double getChkBal(double amount)
	{
		return chkBal;
	}
	
	public void printMenuOptions1() 
	{
		System.out.println("Enter an option:");
		System.out.println("");
		System.out.println("1. Open a new checking account.");
		System.out.println("2. Open a new savings account.");
		System.out.println("3. Exit");
	}	
	public void menu1()
	{ 
	  Scanner in = new Scanner(System.in);
	  int choice;
	  // whle( hasChk == false && hasSav == false) {...}
	  
	  while (hasChk == false || hasSav == false )
	  {
		  printMenuOptions1();
		  choice =in.nextInt();
		  
		  switch (choice)
		  {
		  case 1:
		  {
			  System.out.println("Enter an initial checking deposit: $");
			  chkBal= in.nextDouble();
			  if (chkBal >= 100)
			  {
				  hasChk=true;
				  System.out.println("Checking account balance: $" +chkBal); 
			  }
			  else 
			  {
				  System.out.println("Insufficient funds. Must have an initial deposit of at least $100.00 to open a checking account.");
			  }

			  break;
		  }
		  case 2:
		  {
			  System.out.println("Enter an intitial savings deposit: $");
			  savBal= in.nextDouble();
			  if (savBal >= 50)
			  {
				  hasSav=true;
				  System.out.println("Savings account balance: $" +savBal); 
			  }
			  else 
			  {
				  System.out.println("Insufficient funds. Must have an initial deposit of at least $50.00 to open a savings account.");
			  }
			 // printMenuOptions1();
			 // choice =in.nextInt();
			  break;
		  }
		  case 3:
		  {
			  System.out.println("Thank you for your business!");
			  return;
		  }
		  default:
		  {
			  System.out.println(choice + " is not an option. Please select an option.");
			  //printMenuOptions1();
			 // choice =in.nextInt();
		  }
		 }

		  //while(...){ menu 2 stuff }
	  }	  //end of while loop
	  		menu2();  ///call menu 2
	}
	
	
	public void printMenuOptions2()
	{
	 System.out.println();
	  System.out.println("MAIN MENU:");
	  System.out.println("1. Deposit to money Checking Account");
	  System.out.println("2. Withdraw from Checking Account Money");
	  System.out.println("3. Get Checking Balance");
	  System.out.println("4. Get Savings Balance");
	  System.out.println("5. Transfer Money (Savings to Checkings)");
	  System.out.println("6. Exit");
	}
	
	public void menu2()
	{
		//printMenuOptions2();
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an option:");
		int choice=9;
		while (choice != 6)
		{
			printMenuOptions2();
			choice= in.nextInt();
			switch (choice)
		{
			  case 1: 
			  {
				  System.out.println("Enter a checking deposit amount: $");
				  double amount= in.nextDouble();
				  depositChk(amount);	 
				 // printMenuOptions2();
				 // choice =in.nextInt();
				  break;
			  }
			  case 2:
			  {
				  System.out.println("Enter an amount to withdraw from your checking account: $");
				  double amount= in.nextDouble();
				  withdrawChk(amount);
				//  printMenuOptions2();
				 // choice =in.nextInt();
				  break;
			  }
			  case 3:
			  {
				  System.out.println("Your checking account balance is: $" +getChkBal(chkBal));
				 // printMenuOptions2();
				 // choice =in.nextInt();
				  break;
			  }
			  case 4:
			  {
				  System.out.println("Your savings account balance is: $"+ getSavBal(savBal));
				//  printMenuOptions2();
				//  choice =in.nextInt();
				  break;
			  }
			  case 5: 
			  {
				  System.out.println("Enter Transfer Amount");
				  double amount =in.nextDouble();
				  if(savBal >=amount)
				  {
					  savBal=savBal-amount;
					  chkBal=amount+chkBal;
					  System.out.println("Transfer Successful");
					  System.out.println();
					  System.out.println("Remaining Saving Amount is: " + savBal);
					  System.out.println("Your new Checking Balance is: " + chkBal);
					  
				  }
				  else if (savBal == 0)
				  {
					  System.out.println("Sorry, you have zero dollars inn your savings. You cannot transfer any money.");
					  
				  }
				  else
				  {
					  System.out.println("Insuffcient funds. Please enter a valid amount");
					  System.out.println("Current Checking Balance:" + chkBal);
					  System.out.println("Current Savings Amount:" + savBal);
				  }
				  
				  break;
				  
			  }
			  case 6:
			  {
				  break;
			  }
			  default:
			  {
				  System.out.println(choice + " is not an option. Please select an option.");
			  }
		}
			 
			 
	}
		System.out.println("Thank you for your business!");
	}
	
}	
