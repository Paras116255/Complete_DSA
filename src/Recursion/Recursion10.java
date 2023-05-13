package Recursion;

import java.util.HashSet;

public class Recursion10 {

    // print unique subsequence of a string
    // aaa, aa, aa, aa, a,a,a  ---(unique subsequence)---> aaa,aa,a

   public static void uniqueSubset(String str, int idx,String newStr, HashSet<String> set){

       if (idx == str.length()){
           if (set.contains(newStr)){
               return;
           }else {
               System.out.println(newStr);
               set.add(newStr);
               return;
           }
       }

       char currChar = str.charAt(idx);
       // to be
       uniqueSubset(str, idx+1, newStr+currChar, set);
       // not to be
       uniqueSubset(str, idx+1, newStr, set);
   }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubset(str, 0," ", set);
    }

}
