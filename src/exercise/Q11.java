package exercise;

import java.util.Scanner;

public class Q11 {
	   public static void main( String[] not_in_use )
	   {
	      Scanner keyboard = new Scanner( System.in ) ;

	      int[] array_of_integers      =  new  int[ 100 ] ;
	      int   integer_index          =  0 ;
	      int   integer_from_keyboard  =  0 ;

	      System.out.print("\n This program reads integers from the keyboard."
	                 +  "\n After receiving a zero, it prints the numbers"
	                 +  "\n in reverse order. Please, start entering numbers."
	                 +  "\n The program will stop when you enter a zero.\n\n") ;
	      do
	      {
	         System.out.print( " "  +  integer_index  +  "  Enter an integer: ") ;
	         integer_from_keyboard  =  keyboard.nextInt() ;

	         array_of_integers[ integer_index ]  =  integer_from_keyboard ;
	         integer_index  ++ ;
	      }
	       while  ( integer_from_keyboard  !=  0 ) ;

	      System.out.print( "\n Reverse order:  " ) ;

	      while  ( integer_index  >  0 )
	      {
	         integer_index  -- ;
	         System.out.print( array_of_integers[ integer_index ]  +  "   " ) ;
	      } 
	   }
	}
