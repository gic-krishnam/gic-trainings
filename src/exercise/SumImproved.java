package exercise;

import java.util.* ;

class SumImproved
{
   public static void main( String[] not_in_use )
   {
      @SuppressWarnings("resource")
	Scanner  keyboard  =  new  Scanner( System.in ) ;

      int  integer_from_keyboard ;
      int  one_larger_integer ;

      System.out.print(
          "\n This program is a computer game. Please, type in "
        + "\n an integer in the range  1 ... 2147483646 : " ) ;

      integer_from_keyboard  =  keyboard.nextInt() ;

      one_larger_integer  =  integer_from_keyboard  +  1 ;

      System.out.print( "\n You typed in " + integer_from_keyboard + "."
                     +  "\n My number is " + one_larger_integer    + "."
                     +  "\n Sorry, you lost. I won. The game is over.\n") ;
   }
}
