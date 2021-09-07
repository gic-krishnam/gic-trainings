package day2grid;

import java.util.Scanner;

public class FunctionConstArg {
	public static void main (String[] args)
	{
	//declare float and int
	float r;
	int s,a,b;

	//print message and take input
	System.out.println("Enter Radius of circle:");
	Scanner input = new Scanner(System.in);
	r = input.nextFloat();

	System.out.println("Enter Side of square:");
	s = input.nextInt();

	System.out.println("Enter length and breadth of rectangle:");
	a = input.nextInt();
	b = input.nextInt();

	//call function and print the area
	System.out.println("Area of Circle= "+area(r,3.142f));
	System.out.println("Area of Square= "+area(s));
	System.out.println("Area of Rectangle= "+area(a,b));
	}

	//declare a static functions
	//circle function
	public static float area(float a,float pi)
	{
	float ar = pi*a*a;
	return ar;
	}

	//square function
	public static int area(int a)
	{
	int ar = a*a;
	return ar;
	}

	//rectangle function
	public static int area(int a,int b)
	{
	int ar = a*b;
	return ar;
	}

	}
