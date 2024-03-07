import java.util.*;
public class FibonacciTester {

	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of values to compute for the array: ");
		size=in.nextInt();
		Fibonacci myFib = new Fibonacci(size);
		myFib.setFibo(size);
		System.out.println(myFib.toString());
		
		

	}

}
