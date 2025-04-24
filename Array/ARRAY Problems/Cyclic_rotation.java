public class Cyclic_rotation {


    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,};
        k=2;
        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArray(arr, k);
        System.out.println("Array after " + k + " cyclic rotations: " + Arrays.toString(arr));
    }

}
