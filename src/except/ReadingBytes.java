package except;
import java.io.*;
public class ReadingBytes {
	    public static void main(String[] args) 
	    {
	           //Creating infile stream to read file
	           FileInputStream infile=null;

	           try{
	               infile = new FileInputStream(args[0]);

	               int b;
				//Read and display dataint b;
	               while((b=infile.read())!=1){
	                     System.out.print((char)b);
	                }
	                infile.close();
	            }catch(Exception e) {}
	    }
	}

