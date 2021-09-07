package testing;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaIteratorExample1a {

    public static void main(String[] args) {

        /*
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> iterator = set.iterator();
        */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {

            Integer result = iterator.next();
            System.out.println(result);

        }
    }

}
