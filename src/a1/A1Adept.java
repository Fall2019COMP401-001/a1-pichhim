package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItemAmt = scan.nextInt();
		String[] items = new String[storeItemAmt];
		double[] itemCost = new double[storeItemAmt];
		
		// Scans in all of the store items and their prices
		for (int i = 0; i < storeItemAmt; i++) {
			items[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		// Initializes the amount of customers, and creates arrays to store each customer's name and cost
		int customerCount = scan.nextInt();
		String[] customerFirstName = new String[customerCount];
		String[] customerLastName = new String[customerCount];
		double[] customerCost = new double[customerCount];
		
		// Loops through all customers to add first and last name to their respective array indices
		// Initializes the amount of the specific item bought by the customer as foodAmt
		for (int i = 0; i < customerCount; i++) {
			customerFirstName[i] = scan.next();
			customerLastName[i] = scan.next();
			int foodAmt = scan.nextInt();
			double personCost = 0;
			
			// Loops through each food item and determines amount spent per customer
			for (int j = 0; j < foodAmt; j++) {
				double tempCostOneItem = 0;
				int amtOfFruit = scan.nextInt();
				String tempFood = scan.next();
				for (int k = 0; k < storeItemAmt; k++) {
					if (items[k].equals(tempFood)) {
						tempCostOneItem = itemCost[k];
					}
				}
				personCost += amtOfFruit * tempCostOneItem;
			}
			customerCost[i] = personCost;
		}
		
		// Highest customer count: finds index at which the most is spent
		double highCost = customerCost[0];
		int tempiVar = 0;
		for (int i = 1; i < customerCount; i++) {
			if (customerCost[i] > highCost) {
				highCost = customerCost[i];
				tempiVar = i;
			}
		}
		
		// Lowest customer count: finds index at which the least is spent
		double lowCost = customerCost[0];
		int tempjVar = 0;
		for (int j = 0; j < customerCount; j++) {
			if (customerCost[j] < lowCost) {
				lowCost = customerCost[j];
				tempjVar = j;
			}
		}
		
		// Average of purchases: initializes an average at 0, then
		// loops through each customer to add all of the purchase costs of each customer
		double average = 0;
		for (int k = 0; k < customerCount; k++) {
			average += customerCost[k];
		}
		
		// Divides total cost from all customers by the number of customers to get average
		average = average / customerCount;
		
		// Converts doubles into strings with two decimals
		String twoDecBig = String.format("%.2f", highCost);
		String twoDecSmall = String.format("%.2f", lowCost);
		String twoDecAverage = String.format("%.2f", average);
		
		// Produces output for Biggest, Smallest, and Average spent
		System.out.println("Biggest: " + customerFirstName[tempiVar] + " " + customerLastName[tempiVar] +  " (" + twoDecBig + ") ");
		System.out.println("Smallest: " + customerFirstName[tempjVar] + " " + customerLastName[tempjVar] +  " (" + twoDecSmall + ") ");
		System.out.println("Average: " + twoDecAverage);
		scan.close();	
	}
}
