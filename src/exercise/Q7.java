package exercise;

import java.util.Scanner;

public class Q7 {
	public static void main (String[] args)
	{
	int height;
	double fweight, mweight;

	@SuppressWarnings("resource")
	Scanner scan = new Scanner (System.in);

	System.out.print ("Enter your height: ");
	height = scan.nextInt();


	fweight = 100 + 5*(height - 60); //Calculates Ideal female weight using height
	mweight = 106 + 6*(height - 60); //Calculates Ideal male weight using height

	System.out.println ("Ideal Female Weight: " + fweight); //Displays Ideal Female Weight
	System.out.println ("Ideal Male Weight: " + mweight); //Displays Ideal Male Weight
	}
	}