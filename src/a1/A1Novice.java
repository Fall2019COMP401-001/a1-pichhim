package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Initializes total amount of customers as an integer
		int totalCust = scan.nextInt();
		
		// Scans in first, last name, and item count of the customer by looping through each customer
		for (int i = totalCust; i > 0; i--) {
			String f = scan.next();
			String last = scan.next();
			int totalItem = scan.nextInt();
			double price = 0.00;
			String priceStr = "";
			// Goes through each item, storing its amount, name, and cost
			// price variable tracks total cost spent on food for each person
			for (int a = totalItem; a > 0; a--) {
				int amt = scan.nextInt();
				@SuppressWarnings("unused")
				String food = scan.next();
				double cost = scan.nextDouble();
				price += amt * cost;
				// Converts price from a double to a two-decimal place string
				priceStr = String.format("%.2f", price);
			}
			// End of the loop produces the output for each customer
			System.out.println(f.charAt(0) + ". " + last + ": " + priceStr);

		}
		scan.close();
	}
}
