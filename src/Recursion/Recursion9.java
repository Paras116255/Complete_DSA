package Recursion;

public class Recursion9 {

    //print all the subsequences of a string
    // abc ab ac a bc b c -

    public static void sSubsequence(String str, int idx, String newStr){

        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        // to be
        sSubsequence(str, idx +1, newStr+currChar);

        // not to be
        sSubsequence(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        String str ="abc";
        sSubsequence(str, 0, " ");
    }

}
