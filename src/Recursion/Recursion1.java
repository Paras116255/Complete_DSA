package Recursion;

public class Recursion1 {

    //print all the addition of all the number till nth term
    //1+2+3+4+5+........nth term

    public static void printsum(int i, int n, int sum){
        if (i==n){      //if the i == n the add that last number store int the n also add and this is the base class
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;   // this step will add the new value of the i in the sum
        printsum(i+1, n, sum);
    }

    public static void main(String[] args) {
        printsum(1,5,0);
    }


}
