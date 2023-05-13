public class mmerge {

    public static void conquer(int arr[], int s, int m, int e){
        //declearing new array
        int merged[] = new int[e-s+1];

        //declear new idxs for the new array
        int idx = s;
        int idx2 = m+1;
        //creating int for tracking the new array
        int x = 0;

        while(idx<=m && idx2<=e){
            if (arr[idx]<arr[idx2]){
                merged[x++] = arr[idx++];
            }else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx<=m){
            merged[x++] = arr[idx++];
        }

        while(idx2<=e){
            merged[x++] = arr[idx2++];
        }

        for (int i=0, j=s; i< merged.length; i++, j++){
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int s, int e){
        if (s>=e){
            return;
        }
        int m = s+(e-s)/2;
        divide(arr, s,m);
        divide(arr, m+1,e);
        conquer(arr, s, m ,e);
    }

    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2,5};
        divide(arr,0, arr.length-1);
        printarr(arr);
    }

}
