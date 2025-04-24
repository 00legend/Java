import java.util.*;
public class Reverse_Array{

    public static void Rotate_Array(int[] arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int size=arr.length;
        int k =2;

        System.out.println("Orginal Array: "+Arrays.toString(arr));
        Rotate_Array(arr, 0, size-1);
        Rotate_Array(arr, 0, k-1);
        Rotate_Array(arr, 0, size-k);
        System.out.println("Array after  rotations: "+Arrays.toString(arr));
    }
}