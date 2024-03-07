import java.math.BigInteger; 
public class StringsRFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String s = "apples";
		
		String a = new String("apples");
		
		if(!a.toLowerCase().equals("apples"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		String s = "apples";
		System.out.println(s.indexOf('l'));
		
		
		int[][] array;
		int arrays[][];
		
		arrays = new int[2][3]; // Arrays List in 
		
		double dice = (int)(Math.random()*6+1);
		System.out.println(dice);
		
		//array = [2][2];
		
		int[][] myArray = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Counting the number of elements
	        int rowCount = myArray.length;
	        System.out.println("rowCount: " + rowCount);
	        int columnCount = myArray.length;
	        System.out.println("columnCount: " + columnCount);

	        int totalCount = rowCount * columnCount;

	        System.out.println("Number of rows: " + rowCount);
	        System.out.println("Number of columns: " + columnCount);
	        System.out.println("Total number of elements: " + totalCount);
	        
	        String cd = "cows";
	        
	        System.out.println(cd.length());
	        
	        
	        String originalString = "Hello, World!";
	        printStringBackward(originalString);
	        
	        
	        
	        int[][] array2 = {
	        	    {1, 2, 3},
	        	    {4, 5},
	        	    {6, 7, 8, 9}
	        	};

	        	System.out.println("Number of rows (outer array length): " + array2.length);

	        	// This would cause a compilation error because array.length alone does not refer to the length of inner arrays.
	        	// System.out.println("Length of each inner array: " + array.length);

	        	// To get the length of each inner array, you need to use array[i].length in a loop or at a specific index i.
	        	for (int i = 0; i < array2.length; i++) {
	        	    System.out.println("Length of inner array at index " + i + ": " + array2[i].length);
	        	}
	        
	        
		
		System.out.println();
		
		
		int[][] myArray1 = new int[3][4]; // Example 2D array with 3 rows and 4 columns
        //int totalCount1 = fillArray(myArray1);
		fillArray(myArray1);
        printArray(myArray1); // Display the filled array
        //System.out.println("Total count of elements: " + totalCount1);
        int[][] myArray2 = new int[3][4];
        System.out.println();
        System.out.println();
		fillArrayRandom(myArray2);
		printArray(myArray2);
		
		
		StringBuffer stringBuf = new StringBuffer();
		System.out.println(stringBuf);
		stringBuf.append("abc");
		System.out.println(stringBuf);
		// stringBuf now contains "abc“
		stringBuf.append(123);
		System.out.println(stringBuf);
		// stringBuf now contains "abc123“
		
		
		stringBuf = new StringBuffer("TH8");
		System.out.println(stringBuf);
		stringBuf.insert(2, "X");
		System.out.println(stringBuf);
		// stringBuf now contains "THX8"
		stringBuf.insert(3, 113);
		System.out.println(stringBuf);
		// stringBuf now contains "THX1138“
		char ch = stringBuf.charAt(2); // ch is ‘X’
		System.out.println(stringBuf);
		stringBuf.setCharAt(2, 'a');
		System.out.println(stringBuf);

		// stringBuf now contains "THa1138“
		//The StringBuffer ADT

		
		
		
		String str1 = "dpple";
		String str2 = "banana";

		int result = str1.compareTo(str2);
		System.out.println("The Result is : " + result);

		if (result < 0) {
		    System.out.println(str1 + " comes before " + str2);
		} else if (result > 0) {
		    System.out.println(str1 + " comes after " + str2);
		} else {
		    System.out.println(str1 + " is equal to " + str2);
		}
		
		
		
		
		  
		 BigInteger be; 
		
		// BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)
		
		 //for (BigInteger i = 2; i <= n; i++)
		 
		 //for (int i = 2; i <= n; i++)
		
		

	}
	
	static void printStringBackward(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println(); // Add a newline for better formatting
    }
	
	
	
	public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
	} // end of PrintArray Method  
	
	
	
	
	public static int fillArray(int[][] array) {
        int value = 1;
        int totalCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
                totalCount++;
            }
        }
        return totalCount;
    }
	
	
	
	public static void fillArrayRandom(int[][] myArray)
	{
		for(int i = 0; i < myArray.length ; i++ )
			for(int j = 0; j < myArray[i].length; j++)
				myArray[i][j] = (int)(Math.random()*6+1);
	}
	
	

}
