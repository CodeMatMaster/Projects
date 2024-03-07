import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String[] names = {"John", "Carl" , "Jerry"} ;
		
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file.");
			writer.write("\nHere is another line.");
			
			for(String name : names)
			writer.write('\n'  + name);
			
			
			
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			//reader.readLine();
			String line;
			while((line = reader.readLine()) != null) {
			//System.out.println(reader.readLine());
			System.out.println(line);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	} // end of main method

}
