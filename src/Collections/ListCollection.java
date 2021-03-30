package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();
        a1.add("Shubham");
        a1.add("Rohan");

        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        List<String> l1 = new LinkedList<String>();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");

        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // ArrayList Elements
        //	[Shubham, Rohan]
        // LinkedList Elements
        //	[Zara, Mahnaz, Ayan]
    }
}
