package testing;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> setObject = new HashSet<>();

		setObject.add("ram");
		setObject.add("mohan");
		setObject.add("shyam");
		setObject.add("mohan");

		// duplicates are not allowed but it will not give
		// any compilation error
		setObject.add("ram");
		for (String str : setObject) {
			System.out.println(str);
		}

	}
}
