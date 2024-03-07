import java.util.*;
public class VCollection {

	private ArrayList<Vinyl>records; //array list of vinyls
	
	private double total;
	private int numVinyls;
	Scanner in = new Scanner(System.in); //number input
	Scanner in2= new Scanner(System.in);
	
	
	
	public VCollection()
	{
		records= new ArrayList<Vinyl>();
		total=0;
		numVinyls=0;

	}
	////////////////////////////////////////////////////////
	
	public void addVinyl(String a, int y, double c, String state)
	{
		//constrct an object of the vinyl class
		Vinyl v= new Vinyl(a, y, c , state);
		records.add(v);
		numVinyls++;
		
		
	}
	
	public String toString()
	{
		String report="";
		report="My Vinyls: \n";
		report+="*******************************\n";
		report+="Artist\t\t+Year+\t\tCost+\tCondtion\n";
		
	
		
		for(int i=0; i<numVinyls; i++)
		{
			report+=records.get(i).toString()+ "\n";
		}
		
		return report;
	}
}
