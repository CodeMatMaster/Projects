//java.util.Array;

public class TestReviewStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Mickey T. Mouse";
		
		int locationFirstSpace = name.indexOf(" ");
		
		System.out.println(locationFirstSpace);
		
		String firstName = name.substring(0, locationFirstSpace);
		
		System.out.println();
		
		System.out.println(firstName);
		
		int mi = name.indexOf("."); // Allows ask yourself what type of data is the value returning
		
		String middleInital = name.substring(locationFirstSpace+1, mi+1);
		
		System.out.println(middleInital);
		
		System.out.println(name.substring(0, 3));
		
		String lastName = name.substring(mi+2);
		
		System.out.println(lastName);
		
		
		int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 25) + 1;
            System.out.println(myArray[i]);
        }
		
		int sum = 0;
		for(int n: myArray)
		{
			sum += myArray[n];
		}
		
		
		System.out.println("The total sum of this array is : " + sum);
		
		
		int list[] = { 8, 2, 3};
		
		
		int list2[][] = {
			    {8, 2, 3},
			    {3, 4, 5},
			    {3, 2, 3}
			};
		
		
		String myArray2[] = new String[] {"Ga", "Hello"};
		
		
		String s = "mercer university";
		
		int count = 0;
		int i = 0;
		
		while(i < s.length())
		{
			if(s.indexOf("er" , i) !=-1)
			{
				count++;
				i = s.indexOf("er", i) + 2;
			}
			else {
				break;
			}
		}
		System.out.println("The number of counts is " + count);
		
		
		int[][] a = new int [5][10];
		
		
		
		
		System.out.println(a[2].length + " " + a.length);
		
		

	}
	
	
	  private static String FindMin (String[] list, int numItems)
	  {
	 //  int i = 0;
	    String min = list[0];
	    for (int i = 0; i < numItems; i++)
	      {
	        if (list[i].compareTo(min) < 0)
	          min = list[i];
	      }
	    return min;
	  }

	}



