package day2grid;

public class SwitchStringTest {
		public static void main(String[] args) 
		{
		// Declaring a variable of string type.
		   String gameLevel = "Intermediate";	
		   int level = 0;

		// Using string in switch statement. 
		    switch(gameLevel) {
		// Using string literal in switch case.
		    case "Beginner": level = 1;
		      break;
		    case "Intermediate": level = 2;
		      break;
		    case "Expert": level = 3; 
		      break;
		    default: level = 0;
		      break;
		 }
		System.out.println("Your game level is : " +level); 
		 }
		}
