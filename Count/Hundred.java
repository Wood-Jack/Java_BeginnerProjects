//Count 1-100
import java.util.Iterator;
import java.util.Scanner;

public class Hundred {
	public static void main (String[] args) {
		Scanner scannerInput = new Scanner(System.in);
		
		int startingNumber;
		int endingNumber;
		int counter;
		
		System.out.println("Enter a number to start at: ");
			startingNumber = scannerInput.nextInt();
		System.out.println("Enter a number to end at: ");
			endingNumber = scannerInput.nextInt();
		System.out.println("What increment do you want to count by? ");
			counter = scannerInput.nextInt();
			
		if (count>10) {
			System.out.println("The highest number we go to is 10");
			@Override
			public boolean 
		new Iterator<Integer>() {
			private int i = startingNumber; {
			
				@Override
				public Integer next() {
					return ++i;
				}
				
				@Override
				public boolean hasNext() {
					return i < endingNumber;
				}
		} .forEachRemaining(System.out::println);
	}
}