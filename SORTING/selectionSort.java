// SELECTION SORT O(n^2) solved by brute force
/*  1.first element is selected as minimum and for(int i = 0;i<arr.length()-1;i++)
*    2. then entire array is travered for(int j = i+1;j<n-1;j++)  till a condition is satisfies
                    i.e -> if(arr[j]>arr[j+1])
                    *          swap arr[j] by arr[j+1] */


public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7,3, 2,0,4,5,3,5,6,7,8,9,2,45,69};
        int n = arr.length;

        selectionSorting(arr);
        for (int num : arr) {
            System.out.println(num+ " ");
        }

    }


    public static void selectionSorting(int[] arr) {
        int n=arr.length;

        for (int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }

                // SWAP

                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;


            }

        }

    }
}