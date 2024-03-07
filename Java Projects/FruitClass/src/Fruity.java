public class Fruity //only one class in a file can be public (matches filename)
{
        public static void main(String[] args)
        {
          try{
                Fruit a = new Mandarin(); //polymorphism #1
                a.print(); // outputs Mandarin
                a = new Orange(); // polymorphism #3
                a.print();  // outputs orange

                Fruit f = new Fruit();
                Mandarin m = new Mandarin();
                f = m; // polymorphism #3 Mandarin extends Fruit


                if (f instanceof Orange) //Am a descendant of Orange?
                {
                        Orange o = (Orange) f; //polymorphism #4
                        o.printTwo(); //outputs fruit
                }
          }
          catch (ClassCastException e)
          {
                System.err.println(e.getMessage());
          }
        }
}
