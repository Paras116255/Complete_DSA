package Hashing;

import java.util.HashMap;

public class MajorityElement {

    public static void Me(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i< nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i] , 1);
            }
        }

        for (int key : map.keySet()){
            if (map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }



    public static void main(String[] args) {
        int nums[] = {1,2,4,6,2,1,3,8,1,1};
        Me(nums);
    }
}
