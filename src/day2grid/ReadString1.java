package day2grid;

import java.io.IOException;
import java.io.StringReader;

public class ReadString1 {
		public static void main(String[] args) 
		{
		     String s = "Hello World";
		     StringReader sr = new StringReader(s);
	         try 
	         {	         
		         for (int i = 0; i < 5; i++)
		         {
		            char c = (char) sr.read();
		            System.out.print(" " + c);
		         }
		         sr.close();
		     }
	         catch (IOException ex) 
	         {
		         ex.printStackTrace();
		     }
		}
	}
