package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItemAmt = scan.nextInt();
		String[] items = new String[storeItemAmt];
		double[] itemCost = new double[storeItemAmt];
		int[] totalOfItemBought = new int[storeItemAmt];
		
		// The customersBought array stores how many customers bought each fruit at the same index
		// as its respective items array
		
		int[] customersBought = new int[storeItemAmt];
		
		// Scans in all of the store items and their prices
		for (int i = 0; i < storeItemAmt; i++) {
			items[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		// Initializes the amount of customers, and creates arrays to store each customer's name and cost
		int customerCount = scan.nextInt();
		String[] customerFirstName = new String[customerCount];
		String[] customerLastName = new String[customerCount];
		
		// Loops through all customers to add first and last name to their respective array indices
		// Initializes the amount of the specific item bought by the customer as foodAmt
		for (int i = 0; i < customerCount; i++) {
			customerFirstName[i] = scan.next();
			customerLastName[i] = scan.next();
			int foodAmt = scan.nextInt();
			
			Boolean[] repeatFoods = new Boolean[items.length];
			for (int p = 0; p < items.length; p++) {
				repeatFoods[p] = true;
			}
			
			// Scans through each food per customer, storing the amount of each specific fruit bought by each customer
			// and the food name
			for (int j = 0; j < foodAmt; j++) {
				int amtOfFruit = scan.nextInt();
				String tempFood = scan.next();
				
				// Goes through the items array for each food, testing if the current food input matches the food at the
				// given index. If so, adds 1 to how many customers bought that food and adds the amount of that fruit bought
				// by the customer to the total amount of that fruit bought by all customers.
				for (int k = 0; k < items.length; k++) {
					if (items[k].equals(tempFood)) {
						totalOfItemBought[k] += amtOfFruit;
						if (repeatFoods[k]) {
							customersBought[k] += 1;
							repeatFoods[k] = false;
						}
					}
				}
			}
		}	
		scan.close();
		
		// Loops through each item to print total customers bought and amount of that item bought
		for (int l = 0; l < items.length; l++) {
			if (customersBought[l] == 0) {
				System.out.println("No customers bought "  + items[l]);
			} else {
			System.out.println(customersBought[l] + " customers bought "  + totalOfItemBought[l] + " " + items[l]);
			}
		}
	}
}
