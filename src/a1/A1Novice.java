package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalCust = scan.nextInt();
		for (int i = totalCust; i > 0; i--) {
			String f = scan.next();
			String last = scan.next();
			int totalItem = scan.nextInt();
			double price = 0;
			for (int a = totalItem; a > 0; a--) {
				int amt = scan.nextInt();
				@SuppressWarnings("unused")
				String food = scan.next();
				double cost = scan.nextDouble();
				price += amt * cost;
			}
			System.out.println(f.charAt(0) + ". " + last + ": " + price);

		}
		scan.close();
	}
}
