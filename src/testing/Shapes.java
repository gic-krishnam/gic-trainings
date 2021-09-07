package testing;
import java.util.ArrayList; // importing the ArrayList Class
public class Shapes {
	  public static void main( String args[] ) {
	    ArrayList<String> shapes = new ArrayList<String>(); //create an ArrayList with string data type
	    shapes.add("square");       // add square at index 0
	    shapes.add("triangle");     // add triangle at index 1
	    shapes.add("hexagon");      // add hexagon at index 2
	    shapes.add("rhombus");     // add rhombus at index 3
	    shapes.add("octagon");     // add octagon at index 4
	    shapes.add("rectangle");   // add rectangle at index 5
	    shapes.add("pentagon");   // add pentagon at index 6

	    System.out.println(shapes); // prints all elements of ArrayList shapes

	    System.out.println(shapes.get(4)); // print element at index 4
	    shapes.remove(2);          // removing element at index 2
	    shapes.remove(5);          // removing element at index 5

	    System.out.println(shapes); // prints all elements of ArrayList shapes
	    shapes.set(4,"circle");     // replaces element at index 4 with circle
	    System.out.println(shapes); // prints all elements of ArrayList shapes
	    System.out.println(shapes.size()); // prints the number of elements in the ArrayList 
	    shapes.clear();             // removes all elements in the ArrayList
	    System.out.println(shapes); // prints all elements of ArrayList shapes
	    
	  }
	}
