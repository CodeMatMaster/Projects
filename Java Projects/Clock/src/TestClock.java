import java.util.*;

import java.text.DecimalFormat;


public class TestClock
{
        public static void main(String[] args)
        {
                 
        		
        		Clock dvr = new Clock();
                 
        		DecimalFormat commaFormat;
        		commaFormat = new DecimalFormat("#,###"); 
                 
                 
                
                Scanner in = new Scanner(System.in);

                
                int hours, minutes, seconds;
                
                System.out.println("What time would you like to set your DVR to?\n");
                System.out.print("Hours = ");

                hours = in.nextInt();

                System.out.print("Minutes = ");

                minutes = in.nextInt();

                System.out.print("Seconds = ");

                seconds = in.nextInt();


               dvr.reset(); 
               dvr = new Clock(hours, minutes, seconds);
               
               dvr.format();
                                
                System.out.println("\nThe time is now " + dvr);
                
                
                
                dvr.advance();
                System.out.println("\nThe time is now " + dvr);
                
                
                in.close();
                
} 
      
        
}