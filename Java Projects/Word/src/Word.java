import java.util.*;
public class Word {

private int nums;

private String answer;
private String[]words;
private int index;	
Scanner in = new Scanner(System.in);
public Word()
{
	nums=0;

	answer="";
	words=new String[nums];
}
	
	
	
	public void Menu()
	{
		System.out.println("Welcome to the Jeopardy Word Game:\r\n"
				+ "Objective: Guess a randomly selected word within three attempts\r\n"
				+ "***************************************************************\r\n"
				+ "\r\n"
				+ "How many words will you add to the list ?\r"
				+ "");
	}
	
	
	public void Menu2()
	{
		System.out.println("***************************************************************\r\n"
				+ "You have three attempts to guess the correct word.\r\n"
				+ "You will begin with 300 points. \r\n"
				+ "Each attempt cost 100 points.\r\n"
				+ "You will earn 100 points if you guess the correct word.\r\n"
				+ "***********************************************************\r\n"
				+ "");
		
	}
	
	public void loadWords()
	{
		nums=in.nextInt(); //take out the \n
		words=new String[nums];
		in.nextLine();
		for(int i=0; i<nums; i++)
		{
			System.out.println("Enter a word: ");
			words[i]=in.nextLine(); //input line
		}
	}
	
	
	public String generateRandomWord() //error will return if code is not complete
	{
		Random rand = new Random();
		index=rand.nextInt(nums);
		answer =words[index];
		return answer;
		
	}
	
	
	public void printWords()//method will display all values within the ArrayList
	{
		for(int i=0; i<nums; i++)
		{
			System.out.print(words[i] + "   |  ");
		}
		System.out.println();
	}
	
	
	
	public String getWord() //returns the gameWord
	{
		//return "Your answer is " + answer;
		return answer;
		
	}
	
	
	public void play()
	{
		int Score=0;
		int choice=0;
		int trials=0;
		
			while(trials!=3) {
			System.out.println("Enter a guess: ");
			String guess=in.nextLine();
			if(guess.equals(getWord()))
			{
				Score=100+Score;
				System.out.println("Correct, the word is " + getWord() );
				System.out.println("Your Point: " + Score);
				System.out.println("Play again (1=yes or 2=no)?");
				//in.nextLine()
			}
			else
			{
					trials=1+trials;
					Score=Score-100;
					System.out.println("Incorrect!");
					System.out.println("Your Current Score is : " + Score);
					System.out.println("Enter your guess: ");
				//	in.nextLine();  //
				//	guess=in.nextLine(); //
					
					
					
			}
		}//end of while loop
	}
	
	
	
	
	
	
	
}
