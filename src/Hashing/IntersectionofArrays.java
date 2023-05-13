package Hashing;

import java.util.HashSet;

public class IntersectionofArrays {

    public static void iA(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count =0;

        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for (int j=0; j<arr2.length; j++){
            if (set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        System.out.println( count);
    }

    public static void main(String[] args) {
        int arr1[] = {1,5,2,3,4,5};
        int arr2[] = {1,8,7,6,3,4};
        iA(arr1,arr2);
    }
}
