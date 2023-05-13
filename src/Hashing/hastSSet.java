package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hastSSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert-add

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);

        // search - contains
        if (set.contains(1)){
            System.out.println("yes");
        }

        //delete - remove
        set.remove(4);
        if (!set.contains(4)){
            System.out.println("No, we deleted it");
        }

        //size
        System.out.println("set size:"+ set.size() );

        //Iterator  -- iterator functions: .next(); , .hasNext();
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.print("using hasNext function of iterator"+" "+it.next()+" ");
        }
    }
}
