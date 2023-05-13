package Recursion;

public class Recursion6 {
    //fibonacci Number
    //0,1,1,2,3,5,8,13,21........ nth term

     static int fib(int n){

        if (n==0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        System.out.println( fib(8));
    }
}
