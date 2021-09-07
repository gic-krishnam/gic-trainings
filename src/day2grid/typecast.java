package day2grid;
class typecast {
  public static void main (String args[])
  {
	  byte b;
	  int i=355;
	  @SuppressWarnings("unused")
	  double d=423.150;
	  b=(byte)i;
	  System.out.println("Conversion of int to byte:i= " + i +" b ="+ b);
	  System.out.println("*********************************************");
	  b=(byte) d;
	  System.out.println("Conversion of double to byte: d = "+ d +" b="+ b);  
  }
}
