package Hashing;

import java.util.HashSet;

public class UnionOfArray {

    public static void uA(int arr[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length; i++){
            set.add(arr[i]);
        }
        for (int j=0;j<arr2.length; j++){
            set.add(arr2[j]);
        }

        System.out.println(set.size());
    }

    public static void main(String[] args) {
        int arr1[] = {1,5,2,3,4,5};
        int arr2[] = {1,8,7,6,3,4};
        uA(arr1,arr2);
    }
}
