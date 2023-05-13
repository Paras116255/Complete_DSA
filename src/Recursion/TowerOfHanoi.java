package Recursion;

public class TowerOfHanoi {

    static void tower(int n , char src, char dest, char helper){

        if (n==0){
            return;
        }
        tower(n-1, src, helper, dest);
        System.out.println("Move disk "+ n + " from src "+ src + " to "+ dest);
        tower(n-1, helper, dest, src);
    }

    public static void main(String[] args) {
        int n = 3;
        tower(n, 'A', 'C', 'B');
    }
}
