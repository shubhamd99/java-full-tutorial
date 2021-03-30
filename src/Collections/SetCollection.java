package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        int[] count = {34, 22,10,60,30,22};
        Set<Integer> set = new HashSet<>();
        try {
            for(int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
            System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());

            // [34, 22, 10, 60, 30]
            // The sorted list is:
            // [10, 22, 30, 34, 60]
            // The First element of the set is: 10
            // The last element of the set is: 60
        }
        catch(Exception ignored) {}
    }
}
