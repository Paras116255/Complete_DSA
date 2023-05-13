package Recursion;

public class Recursion14 {

    //find the number of ways in which you can invite n people to your party single or in couple
    // int n = 4;

    public static int party(int n){

        if (n <= 1){
            return 1;
        }
        //singles
        int single = party(n-1);
        //couples
        int couples = (n-1) * party(n-2);
        return single+couples;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(party(n));
    }
}
