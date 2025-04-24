import java.util.*;
public class Cyclic_rotate_by_one {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr= new int[size];

        System.out.println("enter "+size+" elements");
        for(int i=  0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       int last=arr[size-1];
        for(int i = size-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;


        System.out.println("Cyclic rotated array by one");
        for(int num:arr){
            System.out.println("->"+num);
        }

    }
}
