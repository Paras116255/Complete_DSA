package Sorting;

public class MergeSort {

    public static void conquer(int arr[], int s, int m, int e){

        //making new array
        int merged[] = new int[e-s+1];

        //making indexes for both the arrays for track there data
        int idx1 = s;
        int idx2 = m+1;
        int x = 0;    //this x variable is for track the record for the new array

        while(idx1<=m && idx2<=e){
            if (arr[idx1] < arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= m){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= e){
            merged[x++] = arr[idx2++];
        }

        for (int i=0, j=s; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int m = s+(e-s)/2;
        divide(arr, s,m);
        divide(arr,m+1, e);
        conquer(arr, s,m,e);
    }

    public static void main(String[] args) {
        int arr[] = {10,50,60,20,80,30,40,70};
        System.out.println("Merge sort");
        System.out.println("Given array");
        printArray(arr);

        divide(arr, 0, arr.length-1);
        System.out.println("after sort");
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
