package exercise;

import java.util.Scanner;

public class Sum {
	public static void main( String[] not_in_use )
	   {
	      @SuppressWarnings("resource")
		Scanner keyboard = new Scanner( System.in ) ;

	      int  first_integer ;
	      int  second_integer ;
	      int  sum_of_two_integers ;

	      System.out.print( "\n Please, type in an integer:      " ) ;
	      first_integer  =  keyboard.nextInt() ;

	      System.out.print( "\n Please, type in another integer: " ) ;
	      second_integer  =  keyboard.nextInt() ;

	      sum_of_two_integers  =  first_integer  +  second_integer ;

	      System.out.print( "\n The sum of the given integers is " 
	                         +  sum_of_two_integers ) ;
	   }

}
