import java.util.*;
public class IntroToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>names=new ArrayList<String>();
		//sysout
		Scanner in = new Scanner(System.in);
		int numOfNames;
		//sysout
		names.add("Sponge Bob");
		names.add("Simple Simon");
		names.add("Courage");
		
		
		//print names
		for(String n: names)
		{
			System.out.print(n + "  |   ");
		}
		System.out.println();
	
		ArrayList<
		String>friends=new ArrayList<String>(names);
		friends.add("Cindy Lou");
	//print names
		System.out.println("Names");
		for(String n : names)
		{
			System.out.println(n + " |  ");
		}
	System.out.println();
	
	//print friends
	System.out.println("Friends: ");
	for(String f: friends)
	{
		System.out.println(f+ "  |  ");
	}
		
	
	
	}


	


}
