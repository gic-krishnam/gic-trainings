package testing;
import java.util.HashMap;

public class HashMapExample {
	
	@SuppressWarnings("removal")
	public static void main(String[] arr) {

	/* Create object of HashMap */

	HashMap<Integer, String> obMap = new HashMap<Integer, String>();

	/* Add value in HashMap */

	obMap.put(new Integer(1), "Bharat");

	obMap.put(new Integer(2), "Gyan");

	obMap.put(new Integer(4), "Vrishti");

	obMap.put(new Integer(3), "Sarika");

	obMap.put(new Integer(5), "Rohit");

	obMap.put(new Integer(6), "Parineeta");

	/* Display value of HashMap */

	System.out.println("Elements in HashMap : \n" + obMap);

	}

	}
