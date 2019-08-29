package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItemAmt = scan.nextInt();
		String[] items = new String[storeItemAmt];
		double[] itemCost = new double[storeItemAmt];
		for (int i = 0; i < storeItemAmt; i++) {
			items[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		int customerCount = scan.nextInt();
		String[] customerFirstName = new String[customerCount];
		String[] customerLastName = new String[customerCount];
		double[] customerCost = new double[customerCount];
		for (int i = 0; i < customerCount; i++) {
			customerFirstName[i] = scan.next();
			customerLastName[i] = scan.next();
			int foodAmt = scan.nextInt();
			double personCost = 0;
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
		// Highest customer count:
		double highCost = customerCost[0];
		int tempiVar = 0;
		for (int i = 1; i < customerCount; i++) {
			if (customerCost[i] > highCost) {
				highCost = customerCost[i];
				tempiVar = i;
			}
		}
		// Lowest customer count:
		double lowCost = customerCost[0];
		int tempjVar = 0;
		for (int j = 0; j < customerCount; j++) {
			if (customerCost[j] < lowCost) {
				lowCost = customerCost[j];
				tempjVar = j;
			}
		}
		// Average of purchases:
		double average = 0;
		for (int k = 0; k < customerCount; k++) {
			average += customerCost[k];
		}
		average = average / customerCount;
		
		String twoDecBig = String.format("%.2f", highCost);
		String twoDecSmall = String.format("%.2f", lowCost);
		String twoDecAverage = String.format("%.2f", average);
		
		System.out.println("Biggest: " + customerFirstName[tempiVar] + " " + customerLastName[tempiVar] +  " (" + twoDecBig + ") ");
		System.out.println("Smallest: " + customerFirstName[tempjVar] + " " + customerLastName[tempjVar] +  " (" + twoDecSmall + ") ");
		System.out.println("Average: " + twoDecAverage);
		scan.close();
		
	}
}
