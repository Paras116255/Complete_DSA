package Hashing;

import java.util.HashMap;
import java.util.Map;

public class hashMmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //Insert= add
        map.put(101,"paras");
        map.put(102,"abc");
        map.put(103,"ABC");
        map.put(104,"xyz");
        map.put(105,"XYZ");
        System.out.println(map);

        //search = .containKey  .get

        // .containKey
        if (map.containsKey(105)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }

        // .get
        System.out.println(map.get(104));


        //Iterator

        for (Map.Entry<Integer, String> e :map.entrySet()){
            System.out.print(e.getKey()+"=");
            System.out.print(e.getValue()+" ");
        }

        System.out.println();

        //delete

        map.remove(105);
        System.out.println(map);
    }
}
