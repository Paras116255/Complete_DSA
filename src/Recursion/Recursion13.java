package Recursion;

public class Recursion13 {

    // place the tiles of size 1*m in a floor of size n*m
    // int n = 4, m=2;

    public static int placeTiles(int n, int m){
        if (n == m){
            return 2;
        }

        if (n < m){
            return 1;
        }

        //vertically
        int verti = placeTiles(n-m,m);

        //horizont
        int hori = placeTiles(n-1, m);

        return verti + hori;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n,m));
    }



}
