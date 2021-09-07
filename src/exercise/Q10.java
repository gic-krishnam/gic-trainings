package exercise;

import java.util.Scanner;

public class Q10 {
	    public static void main(String args[]) {
	        Scanner input = null;
	        double km,mi,distance;
	        int option;
	        try {
	            input = new Scanner(System.in);
	            System.out.println("Choose an Option:");
	            System.out.println("Convert Kilometers to Miles(k)");
	            System.out.println("Convert Miles to Kilometers(m)");
	            option = Integer.parseInt(input.nextLine());
	            if (option != 1 && option != 2)
	            {
	                System.out.println("Plz choose option 1 or 2");
	                System.exit(0);
	            }
	            if(option == 1) {
	                System.out.println("Enter Distance in Kilometers");
	                distance = Double.parseDouble(input.nextLine());
	                mi = 0.62 * distance;
	                System.out.println("Distance in Miles is:" + mi );

	            }
	            else if(option == 2) {
	                System.out.println("Enter Distance in Miles");
	                distance = Double.parseDouble(input.nextLine());
	                km = 1.60 * distance;
	                System.out.println("Distance in Kilometers is:" + km );
	            }
	        }
	        catch(Exception e)
	        {
	            System.out.print("Error.Program Terminated");
	        }
	        finally
	        {
	            if (input != null) {
	                input.close();
	            }
	        }
	    }
	}
