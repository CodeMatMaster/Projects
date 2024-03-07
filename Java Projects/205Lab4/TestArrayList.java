import java.util.*;
import java.util.Scanner;

public class TestArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> myArrayList = new ArrayList<String>(10);
        myArrayList.add("Python");
        myArrayList.add("Java");
        myArrayList.add("Java");
        myArrayList.add("Java");
        myArrayList.add("Java");
        myArrayList.add("Java");
        myArrayList.add("C++");
        myArrayList.add("C++");
        myArrayList.add("C++");
        myArrayList.add("C++");


        delete(myArrayList, "Java");
        printArrayList(myArrayList);



        count(myArrayList, "C++");


    }

   Scanner in = new Scanner(System.in);

    private static void printArrayList(ArrayList<String> myArrayList)
    {
        // Pre  : myArrayList has been initialized
        // Post : The elements of Vector v are printed to the screen on separate lines
        
        for(String i: myArrayList){
        System.out.println(i);

        }


    }



   private static void delete(ArrayList<String> myArrayList, Object key)
    {
        // Pre  : myArrayList has been initialized
        // Post : All copies of key are removed from myArrayList
        
//      System.out.println("Enter a word to remove from the ArrayList");
//      String element = in.nextLine(); 
    
        myArrayList.removeIf(element -> element.equals(key)); //new method that I found and learned

        // removeIf is an method that already exists in Java
        // '->' is a lambda
        // Lambda is just another way to represent a block of code/
        // It consists of 3 parts: set of parameters, an arrow, and then a body

    }

    private static int count(ArrayList<String> myArrayList, Object key)
    {
        // Pre  : myArrayList has been initialized
        // Post : number of occurrences of key is computed and returned



        int count = 0;

        for(String i: myArrayList){
        if(i.equals(key))
        {
        count++;
        }
   }

        System.out.println("The number of occurrences of '" + key + "' is " + count);
        return count;
    }
}

