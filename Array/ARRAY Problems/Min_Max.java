import java.util.Scanner;
import java.util.Arrays;

class Min_Max{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size:");
         int size = sc.nextInt();
         int[] arr = new int[size];

        System.out.println("enter "+size+" numbers");
        for(int i = 0; i<size ; i++)
            arr[i]= sc.nextInt();

        int max=arr[0];
        int min=arr[0];

        for(int i =0;i<size;i++) {
            if (arr[0] < min)
                min = arr[i];
            if (arr[0]>max)
                max=arr[i];
        }

        System.out.println(min);
        System.out.println(max);


    }
}