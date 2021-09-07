package testing;

import java.util.LinkedList;

public class LinkedListExample {
	 public static void main(String[] args) {
		 
	       LinkedList<String> Box= new LinkedList<String>();
	 
	       Box.add("Apple");
	 
	       Box.add("Mango");
	 
	       Box.add(1,"Grapes"); //adding “Anu” in the index 1
	 
	       for(String s:Box){ //iterating using for loop
	 
	           System.out.println("Item:"+s);
	 
	       }
	 
	     }
}
