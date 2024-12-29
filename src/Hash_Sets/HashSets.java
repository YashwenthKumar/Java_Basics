package Hash_Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("Alex");
        name.add("Jordan");
        name.add("Ben");
        name.add("Ben");
        System.out.println(name.contains("Alex"));
        Iterator<String> it = name.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println(name);
        HashSet<Integer> nums = new HashSet<>();
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(11);
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
