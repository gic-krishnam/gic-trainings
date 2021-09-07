package exercise;

import java.util.Scanner;

public class Q8 {
	   public static void main( String[] not_in_use )
	   {
	      Scanner keyboard = new Scanner( System.in ) ;

	      float  distance_in_miles ;
	      float  distance_in_kilometers ;

	      System.out.print( "\n This program converts miles to kilometers." 
	                     +  "\n Please, give a distance in miles:  "  ) ;

	      distance_in_miles  =  keyboard.nextFloat() ;

	      distance_in_kilometers  =  1.6093F * distance_in_miles ;

	      System.out.print( "\n "  +  distance_in_miles  +  " miles is "
	                     +  distance_in_kilometers  +  " kilometers." ) ;

	      System.out.printf( "\n %.3f miles is %.3f kilometers.",
	                         distance_in_miles,  distance_in_kilometers ) ;
	   }
	}
