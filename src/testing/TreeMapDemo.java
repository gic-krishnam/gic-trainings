package testing;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] a)
{
      TreeMap<Integer, String> tm=new TreeMap<>();
      tm.put(1, "RED");
      tm.put(19, "BLUE");
      tm.put(20, "BLACK");
      tm.put(7, "ORANGE");
      tm.put(20, "RED");
      tm.put(31, "PURPLE");//sorted
      for(Entry<Integer, String> e:tm.entrySet())
      {
            System.out.println(e.getKey()+"\t"+e.getValue());
      }
}
}