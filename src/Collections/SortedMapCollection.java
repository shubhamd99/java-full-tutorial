package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapCollection {
    public static void main(String[] args) {
        // Create a hash map
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // Put elements to the map
        tm.put("Zara", 3434.34);
        tm.put("Mahnaz", 123.22);
        tm.put("Ayan", 1378.00);
        tm.put("Daisy", 99.22);
        tm.put("Qadir", -19.08);

        // Get a set of the entries
        Set set = tm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = (Double) tm.get("Zara");
        tm.put("Zara", balance + 1000);
        System.out.println("Zara's new balance: " + tm.get("Zara"));
    }
}
