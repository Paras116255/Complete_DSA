package Sorting;

public class InsertionSort {

        //print function
        public static void printArray(int arr[]){
                for(int i=0; i<arr.length; i++){
                        System.out.print(arr[i]+" ");
                }
                System.out.println();
        }

        public static void main(String[] args) {
                int arr[] = {7,8,3,1,2,5};
                for(int i=0; i<arr.length; i++){
                        int curr = arr[i];
                        int j = i-1;

                        while(j>=0 && arr[j]>curr){
                                arr[j+1] = arr[j];
                                j = j-1;
                                printArray(arr);
                        }
                        arr[j+1] = curr;
                        printArray(arr);
                }



        }

}
