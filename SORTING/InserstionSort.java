/* INSERTION SORT -> O(n) worst case only using while
-> can be solved using O(n2)

1.consider a array of elements
2.start at 2nd element i.e at index 1 loop till n-1 where n=arr.length
3.assign arr[i] to key variable
4. and let j be variable where j=i-1; i.e left side of i
5.j+1 will be i itself !lol
6.check condition using while loop with break point
          j<=0 && arr[j]<key;
          then arr[j+1]=arr[j];
                j--; // coz j has to be reduced to check all elements if index i=5;
                      // and if condition j=-1 for that break condition is used j<=0 in while loop
7.and arr[j+1]=key ;
    // to place i elements at its position
 */



public class InserstionSort {


    public static void insertion(int[] arr){

        int n= arr.length;
        for (int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;

        }



        }

    public static void main(String[] args) {
        int[] arr={8,7,4,2,1,3,5,6};
        int n=arr.length;

        for (int num:arr)
        {
            System.out.println("SORTED ARRAY"+num);

        }

        insertion(arr);

        for (int num:arr) {
            System.out.println("ARRAY before sorting"+num);
        }


    }
}
