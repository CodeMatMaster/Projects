class Fruit 
{
     public void print() {
               System.out.println("Fruit");
          }
}

class Orange extends Fruit
{
      public void print() {
               System.out.println("Orange");
          }
      public void printTwo() {
              super.print();
         }
}

class Mandarin extends Orange
{
      public void print() { //overriding
              System.out.println("Mandarin");
         }
}

              
