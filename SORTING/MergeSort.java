/* MERGE SORT -> time complexity O(n logn) less fast than O(n)
-> STABLE

1.uses DIVIDE AND CONQURE algo
2.create method mergesorting(int[] arr){}
3.divide array arr.length/2;
4.create a left and right array to store 2 parts of array
5.use System.arraycopy() to copy array of elements to left array an dto right array
          //-> system.arraycopy(arraySource,  StartingIndexPosition,StartArray   , destinationIndexPosition,  length);


6.create another method Merge(arr,left,rigght) to call recursively

    // This method merges two sorted arrays into one sorted array
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements of left and right and insert the smaller one into arr
        while (j < left.length && i < right.length) {
            if (left[j] <= right[i]) {
                arr[k++] = left[j++]; // Copy from left if smaller
            } else {
                arr[k++] = right[i++]; // Otherwise copy from right
            }
       }
        // Copy any remaining elements from left (if any)
        while (j < left.length) {
            arr[k++] = left[j++];
        }
        // Copy any remaining elements from right (if any)
        while (i < right.length) {
            arr[k++] = right[i++];
        }
    }

* */


public class MergeSort {

    public static void mergesorting(int arr[]){

        if (arr.length< 2) {
            return;
        }
        int mid=arr.length/2;

        int[] left=new int[mid];
        int[] right=new int[arr.length-mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length-mid);

        mergesorting(left);
        mergesorting(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr ,int[] left,int[] right){
        int i=0,j=0,k=0;

        while (j < left.length && i <right.length) {

            if(left[j]<=right[i]){
                arr[k++]=left[j++];
            }else{
                arr[k++]=right[i++];
            }
        }

        while (j< left.length){
            arr[k++]=left[j++];
        }
        while(i<right.length){
            arr[k++]=right[i++];
        }
    }


    public static void main(String[] args) {
        int[] arr={8,5,3,4,2,1};

        mergesorting(arr);

        for (int num:arr){
            System.out.print(" "+num+" ");
        }
    }



}