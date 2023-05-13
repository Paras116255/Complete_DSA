package javapractice;

public class reverseAnArray {

    public static void reverseArr(int arr[], int start, int end){
        int temp;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArr(int arr[], int size){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println("original array");
        printArr(arr,5);
        System.out.println("reversed array");
        reverseArr(arr,0,4);
        printArr(arr,5);

       //brute force
        /*int array1[] = {1,2,3,4,5};
        System.out.println("original array");
        for (int i=0; i< array1.length; i++){
            System.out.print(array1[i]+" ");
        }

        System.out.println();
        System.out.println("reverse an array: ");
        for (int i= array1.length-1;i>=0;i--){
            System.out.print(array1[i]+" ");
        }*/




    }


}
