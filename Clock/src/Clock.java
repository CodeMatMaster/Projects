public class Clock{
        private int hours;
        private int minutes;
        private int seconds;
        
        private String Hour, Minute, Second;

        public Clock(int myHrs, int myMins, int mySecs){
        hours = myHrs; 
        minutes = myMins;
        seconds = mySecs;
        
        
        Second = "" + mySecs;
        Minute = "" + myMins;
        Hour = "" + myHrs;

}

        public Clock() { 
        hours = 0;
        minutes = 0;
        seconds = 0;
}

        public void reset(){
        hours = 0;
        minutes = 0;
        seconds = 0;
        
       
        
}


        public void  advance() {
        	
        System.out.println("\nAdvancing the time!");
        
        seconds++;	 
        	
        if(seconds >= 60) 
        {
        seconds = 00;
        minutes++;

        
        
        }
        
      

        if(minutes >= 60)
        {
        hours++;
        minutes = 0;
       
        }

        if(hours >= 24)
        {
        hours = 0;
    
        }
        
        Second = "" + seconds;
        Minute = "" + minutes;
        Hour = "" + hours;
        
        
        
        if(seconds < 10)
        {
        Second = "0" + seconds;
        

        
        }
        
        if(minutes < 10)
        {
        	Minute = "0" + minutes;
        }
        
        if(hours < 10)
        {
        	Hour = "0" + hours;
        }
       

        } 
        
        
        
        
        public void  format() {
        	
                        	
            if(seconds >= 60) 
            {
            seconds = 00;
      
            
            
            
            }
            
          

            if(minutes >= 60)
            {

            minutes = 0;
           
            }

            if(hours >= 24)
            {
            hours = 0;
        
            }
            
            Second = "" + seconds;
            Minute = "" + minutes;
            Hour = "" + hours;
            
            
            
            if(seconds < 10)
            {
            Second = "0" + seconds;
            
   
            
            }
            
            if(minutes < 10)
            {
            	Minute = "0" + minutes;
            }
            
            if(hours < 10)
            {
            	Hour = "0" + hours;
            }
           

            } 
        
        
        


        public String toString()
        {
        return  Hour + ":" + Minute + ":" + Second;
        
       
        
        
        }
        
} 
