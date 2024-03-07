import java.util.*;
import java.text.NumberFormat;
public class Vinyl {

	private String artist;
	private int year;
	private double cost;
	private String condition;
	NumberFormat fmt= NumberFormat.getCurrencyInstance();
	public Vinyl(String a, int y, double c, String state)
	{
		artist=a; //first argument will be assigned to artist
		year=y;
		cost=c;
		condition=state;
	}
			
/////////////////////////////////////////////////////////////////////////	
	public String toString()
	{
		String record=""; //instantiate a null value
		record=fmt.format(cost)+ "\t" + year + "\t " + artist + "\t " + condition;
		
		return record;
	}
	
}
