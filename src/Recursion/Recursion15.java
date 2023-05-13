package Recursion;

import java.util.ArrayList;

public class Recursion15 {

    //print all the subset of a set of first n natural numbers
    // int  n = 3;

    //print Function
    public static void printSubset(ArrayList<Integer> subset){
        for (int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
   public static void sSubset(int n, ArrayList<Integer> subset){

       if (n == 0){
           printSubset(subset);
           return;
       }

       //to be
       subset.add(n);
       sSubset(n-1, subset);

       //not to be
       subset.remove(subset.size()-1);
       sSubset(n-1, subset);
   }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        sSubset(n, subset);
    }

}
