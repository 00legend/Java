import java.util.*;

public class Negative_elements {
    public static void sorting(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,-1,-3,-4,-4};
        System.out.println("orgiinal array:"+Arrays.toString(arr));
        sorting(arr);
        System.out.println("sorting array:"+Arrays.toString(arr));
    }
}
