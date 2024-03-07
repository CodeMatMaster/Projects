import java.util.*;
import java.text.DecimalFormat;
public class GradeAverage 
{
		//instance variables
		private int numValues;
		private double grades[];
		private double total;
		private double avg;
		private int choice;
		Scanner in = new Scanner(System.in);
		DecimalFormat myDF= new DecimalFormat("###.##");
		
		//constructor
		public GradeAverage()
		{
			System.out.println("Enter the number of grades to be entered: ");
			numValues=in.nextInt();
			grades=new double[numValues];
			total=0;
			avg=0;
		}

		public void loadGrades()
		{
			for(int i=0; i<numValues; i++)
			{
				System.out.println("Enter grade: ");
				grades[i]=in.nextDouble();
				total+=grades[i];
			}
		}
///////////////////////////////////////////////
		public void printGrades()
		{
			for(int i=0; i<grades.length; i++)
			{
				System.out.print(grades[i] + "   |   ");
			}
			System.out.println();
		}
///////////////////////////////////////////////////////
		public void computeAvg()
		{
			avg=total/numValues;
		}

///////////////////////////////////////////////////////////
		public double getAvg()
		{
			return avg;
		}

////////////////////////////////////////////////////////////////
		public double getTotal()
		{
			return total;
		}
///////////////////////////////////////////////////////
		public void run()
		{
			loadGrades();
			computeAvg();
			printGrades();
			System.out.println("Total: " + total);
			System.out.println("Average: " + myDF.format(avg));
		}


//////////////////////////////////////////////////////////////








}
