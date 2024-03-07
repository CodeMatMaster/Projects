public class Stats
{
        private static final int MAX_SIZE = 100;

        public static void main(String[] args)
        {
                int[] List = new int[MAX_SIZE];
                int numItems;

                numItems = fillUp (List);

                System.out.println("\n\10\7" + " The range of your " +
                                   numItems + " items is :  " +
                                   range (List, numItems));

                System.out.println("\n\10\7" + " The mean of your " +
                                   numItems + " items is  :  " +
                                   mean (List, numItems));
        } //end of main method

        private  static int fillUp(int[] List)
        {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please Input Your Values (Enter a 0 to Stop): " + "\n");

        while(true)
        {
                List[n] = in.nextInt();

                if(List[n] == 0)
                        break; //break just breaks the while loop rather than making the condition false
                n++; //this continues to increase the array size for the user to input

        }
                return n; // n is the number of ITMEMS and NOT THE ARRAY
        } // end of static fillUp method


        public static int range (int[] List, int numItems)
        {
                int max = List[0];  int min = List[0];  // we do not declare this method as a global variable. Rather, just a local variable for the method.


        }




}

