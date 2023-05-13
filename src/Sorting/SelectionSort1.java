package Sorting;

public class SelectionSort1 {

    //print function
    public static void printArray(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //section sort
    public static void sort(int arr[]){

       for (int i=0; i< arr.length-1; i++){
           int mid_idx = i;
           for (int j=i+1; j< arr.length; j++){
               if (arr[j] < arr[mid_idx]){
                   mid_idx = j;
               }
           }
           //swap
           int temp = arr[mid_idx];
           arr[mid_idx] = arr[i];
           arr[i] = temp;

       }

    }

    public static void main(String[] args) {
        SelectionSort1 ss = new SelectionSort1();
        int arr[] = {7,8,3,1,2};
        System.out.println("given array");
        printArray(arr);

        ss.sort(arr);
        System.out.println("after the sort");
        ss.printArray(arr);
    }
}
