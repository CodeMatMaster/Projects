import java.util.*;
public class WordTester {

	public static void main(String[] args) {
		/*
		 *
		 *
		Word object = new Word();
		Scanner in = new Scanner(System.in); //input buffer  delimits (determine boundaries)
		String[]words;
		int index;
		
		int choice=0;
		object.Menu();
		int nums = 0;
		nums=in.nextInt(); //int does not care about \n
		in.nextLine();
		words=new String[nums]; //the type of array goes by the bracket (String not INT)
		for(int i=0; i<nums; i++)
		{
			System.out.println("Enter a word: ");
			words[i]=in.nextLine(); //input line
		}
		
		Random rand = new Random(); //cant add one to rand because it is an object
		
		index=rand.nextInt(nums); //parameterized constructor
		
		String answer =words[index];
		System.out.println(answer);
		
		//System.out.println(words[index]);
		
		int Score =0;
		int trials=0;
		
		int trials =0;
		int choice=0;
*/
		
		
		
		
		Word object = new Word();
		object.Menu();
		object.loadWords();
		object.printWords();
		object.Menu2();
		object.getWord();
		object.generateRandomWord();
		
		System.out.println(object.generateRandomWord());
		
		
		Scanner in = new Scanner(System.in);
		Scanner in2=new Scanner(System.in);
		int Score=300;
		int choice=0;
		int trials=0;
		
			while(trials!=3) {
			System.out.println("Enter a guess: ");
			String guess=in2.nextLine();
			if(guess.equals(object.getWord()))
			{
				Score=100+Score;
				System.out.println("Correct, the word is " + object.getWord() );
				System.out.println("Your Point: " + Score);
				System.out.println("Play again (1=yes or 2=no)?");
				//in.nextLine();
				choice=in.nextInt();
			}
			else
			{
					trials=1+trials;
					Score=Score-100;
					System.out.println("Incorrect!");
					System.out.println("Your Current Score is : " + Score);
					System.out.println("Enter your guess: ");
					//guess=in.nextLine();
					
					
					
			}
		}//end of while loop
		System.out.println("Sorry you did not guess the word within three tries!");
		System.out.println("Your Points:" + Score);
		System.out.println("Play again (1=yes or 2=no)?");
		choice=in.nextInt();
		//in.nextLine();
		switch(choice)
		{
		case 1:
		{
			while(choice==1) {
			Score =Score;
			trials=0;
			object.Menu();
			object.loadWords();
			object.printWords();
			object.Menu2();
			object.getWord();
			object.generateRandomWord();
			object.play();
			choice=in.nextInt(); //there is an error with this line
			System.out.println("Sorry you did not guess the word within three tries!");
			System.out.println("Your Points:" + Score);
			System.out.println("Play again (1=yes or 2=no)?");
			choice=in.nextInt();
			}
			break;
		
	}
		case 2:{
		System.out.println("Thank you for playing!");
		break;
		
		}
	
		default :
		{
			System.out.println("Invaid Input. Please enter 1 or 2.");
			break;
		}
	
	}
		
		
	
		
		
		
		
		
		
		
		
		
		
	
	}
}

