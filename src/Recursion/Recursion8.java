package Recursion;

public class Recursion8 {
    //remove duplicates from the string
    // str= "abacbaacd"

    // this boolean function will pass the true if that char present in the alphabet
    // otherwise it will show false then add that char in the alphabet array and pass the true statement and move to the new char
    public static boolean[] map = new boolean[26];


    public static void removeDuplicate(String str, int idx, String newStr){

        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }


        char currChar = str.charAt(idx);
        if (map[currChar - 'a']){
            removeDuplicate(str, idx+1, newStr);
        }else {
            newStr += currChar;                   // this is the false statement then add that char into the alphabet array
            map[currChar - 'a'] = true;           // then this statement will pass the true and move the index onto next char
            removeDuplicate(str, idx+1, newStr);
        }
    }

    public static void main(String[] args) {
        String str= "abacbaacd";
        removeDuplicate(str, 0, " ");
    }
}
