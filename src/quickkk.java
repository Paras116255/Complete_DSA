public class quickkk {

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<=high-1; j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i, j);

            }
        }
        swap(arr,i+1, high);
        return i+1;
    }
    public static void quick(int arr[], int low, int high){
        if (low<high){
            int pi = partition(arr, low, high);
            quick(arr,low, pi-1);
            quick(arr,pi+1, high);

        }
    }

    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2,5};
        quick(arr, 0, arr.length-1);
        printarr(arr);
    }

}
