package pattern;

public class pattern2 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for (int i=1; i< 2*n ; i++){
            for (int j=1; j< n; j++){
                if (i>n){
                    j--;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
