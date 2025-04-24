/* BUBBLE  SORT
*          - Always remember O(n^2)  only brute force /
            - for(int i from 0 to n-1){
                        for(int j from 0 to n-i-1)  =>  to remove or ignore sorted from i
                         }

                         * checks each elemnts and compare it to next and swap

 */

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={9,3,4,6,8,1,2};
        int n=arr.length;


        bubbleSorting(arr);
        System.out.println("SORTED ARRAY: ");
        for (int num:arr) {
            System.out.println(num+" ");

        }

    }

    public static void bubbleSorting(int[] arr){
        int n=arr.length;
        for(int i =0;i<n-1;i++){
            boolean sorted=false;
            for (int j =0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    sorted = true;

                }

            }
            if(!sorted)
                break;

        }
    }


}
