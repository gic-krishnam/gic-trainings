package exercise;
import java.util.* ;
public class RepeatableProgram
	{
	   public static void main( String[] not_in_use )
	   {
	      @SuppressWarnings("resource")
		Scanner  keyboard  =  new  Scanner( System.in ) ;

	      boolean user_wants_to_play_more = true ;

	      while ( user_wants_to_play_more == true )
	      {
	         System.out.print(
	             "\n This program is a computer game. Please, type in "
	           + "\n an integer in the range  1 ... 2147483646 : " ) ;
	   
	         int integer_from_keyboard = keyboard.nextInt( ) ;
	   
	         int one_larger_integer  =  integer_from_keyboard + 1 ;
	   
	         System.out.print( "\n You typed in " + integer_from_keyboard + "."
	                        +  "\n My number is " + one_larger_integer    + "."
	                        +  "\n Sorry, you lost. I won. The game is over.\n") ;

	         System.out.print( "\n You want to play more (Y/N) ? " ) ;

	         String user_choice = keyboard.nextLine().trim() ;

	         if ( ! user_choice.equalsIgnoreCase( "Y" ) )
	         {
	            user_wants_to_play_more = false ;
	         }
	      }
	   }
}
