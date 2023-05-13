package Recursion;

public class Recursion2 {
    //Move all the X and print then in the last
    //str ="axbxcxxd"

    public static void moveAllX(String str, int idx, int count, String newStr){
        if (idx == str.length()){
            for (int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }


        char currChar = str.charAt(idx);   //this step convert all the string into char with the idx of there particular index
        if (currChar =='x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else {
            newStr += currChar;
            moveAllX(str, idx+1, count, newStr);
        }

    }


    public static void main(String[] args) {
        String str ="axbxcxxd";
        moveAllX(str,0,0," ");
    }


}
