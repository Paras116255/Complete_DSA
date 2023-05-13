package Recursion;

public class Recursion4 {
    //find first and last occurance of an element in string
    //str == "abaacbaaabccabaabbb"

    public static int first = -1; // -1 is because we need to calculate accurate index number of the first a
    public static int last = -1;  // -1 is because we need to calculate accurate index number of the last a

    public static void flOccurance(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element){
            first = idx;
        }else {
            last = idx;
        }

        flOccurance(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacbaaab";
        flOccurance(str, 0, 'a');
    }

}
