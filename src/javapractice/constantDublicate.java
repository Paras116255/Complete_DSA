package javapractice;

import java.util.Arrays;

public class constantDublicate {

   public static boolean dublicate(int nums[]){
       Arrays.sort(nums);

       for (int i=0; i< nums.length-1; i++){
           if (nums[i] == nums[i+1]){
               return true;
           }
       }
       return false;
   }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        dublicate(num);
    }
}
