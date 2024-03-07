import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class PracticeSwitchStatements {

	public static void main(String[] args)  {  //throws IOException
		// TODO Auto-generated method stub
		
		String input = "0";
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter input a valid # ");
		input = in.nextLine();
		
		
		//!string1.equals("A")
       // &&
		while(!input.equals("1") && !input.equals("2") 
				
				
				
				)
		
		switch(input) {
		
		case "1":{
		
		System.out.println("Hello World 1");
		break;
		}
		
		case "2":{
			
		System.out.println("Hello World 2");
		break;
		}
		
		System.out.println(" ** Can't open input file.  Try again. **\n"
				+ "\n"
				+ "\n"
				+ "        Here are the files in the current directory :\n"
				+ "\n"
				+ "library.dat  play.dat\n"
				+ "\n"
				+ "        Filename : ");
		
		/*
		case "3":{
			
		System.out.println("Hello World 3");
		break;
		
		}
		*/
		
		
		default:{
		System.out.println("Wrong Random Task.");
		input = in.nextLine();
		}
			
		
			
			
		} // end of switch statement
		
		
        //Get all files from directory
        File curDir = new File(".");
        String[] fileNames = curDir.list();
        ArrayList<String> data = new ArrayList<String>();

        //Find files which may have data. (aka, are in the .dat format)
        for(String s:fileNames)
                if(s.endsWith(".dat"))
                        data.add(s);	
		
		
		
		

	} // end of main 
	
	public static void introPrompt() {
	
	System.out.println("\n"
			+ "                            THE BOOK SEARCH PROGRAM                            \n"
			+ "-------------------------------------------------------------------------------\n"
			+ "\n"
			+ "        What file is your book data stored in?\n"
			+ "\n"
			+ "        Here are the files in the current directory :\n"
			+ "\n"
			+ "library.dat  play.dat\n"
			+ "\n"
			+ "        Filename : ");
	
		
	}
	

	private static void selectionSort (int[] list)
	  {
	        int minIndex, index, j;
	        int temp;

	        for (index = 0; index < list.length-1; index++)
	        {
	                minIndex = index;
	                for (j = minIndex+1; j < list.length;  j++)
	                        if (list[j] < list[minIndex])
	                                minIndex = j;

	                if (minIndex != index)
	                {
	                    temp = list[index];
	                    list[index] = list[minIndex];
	                    list[minIndex] = temp;
	                }

	        }
	  }
	
	private static void selectionSorts(ArrayList<LibraryBook> list) {
	    int minIndex;
	    LibraryBook temp;

	    for (int index = 0; index < list.size() - 1; index++) {
	        minIndex = index;
	        for (int j = minIndex + 1; j < list.size(); j++) {
	            // Assuming LibraryBook implements Comparable<LibraryBook>
	            if (list.get(j).compareTo(list.get(minIndex)) < 0) {
	                minIndex = j;
	            }
	        }

	        if (minIndex != index) {
	            temp = list.get(index);
	            list.set(index, list.get(minIndex));
	            list.set(minIndex, temp);
	        }
	    }
	}
	
	
	
	private static void selectionSort(ArrayList<LibraryBook> list) {
	    int minIndex;
	    LibraryBook temp;

	    for (int index = 0; index < list.size() - 1; index++) {
	        minIndex = index;
	        for (int j = minIndex + 1; j < list.size(); j++) {
	            
	            if (list.get(j).getTitle().compareTo(list.get(minIndex).getTitle()) < 0) {
	                minIndex = j;
	            }
	        }

	        if (minIndex != index) {
	            temp = list.get(index);
	            list.set(index, list.get(minIndex));
	            list.set(minIndex, temp);
	        }
	    }
	}
	
	
	
	System.out.println("                            THE BOOK SEARCH PROGRAM                            \n"
			+ "-------------------------------------------------------------------------------\n"
			+ "\n"
			+ "        What file is your book data stored in?\n"
			+ "\n"
			+ "        Here are the files in the current directory :\n"
			+ "\n"
			+ "library.dat  play.dat\n"
			+ "\n"
			+ "        Filename : \n"
			+ "");
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	

/*
 * 
 * try {
			input = in.nextInt();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
 */

}


