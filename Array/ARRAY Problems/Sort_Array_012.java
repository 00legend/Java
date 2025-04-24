import java.util.*;

public class Sort_Array_012 {


  public static void sorting(int[] arr){
      int count0=0, count1=0, count2=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
           else if(arr[i]==2){
                count2++;
            }
        }

        int i =0;
        while(count0-->0)                   // while(count0>0){ count0--;  arr[i]=0;  i++;}
            arr[i++]=0;
        while(count1-->0)                   // while(count1>0){ count1--;  arr[i]=1;  i++;}
            arr[i++]=1;
        while(count2-->0)                   // while(count>0){ count2--;  arr[i]=2;  i++;}
            arr[i++]=2;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2,0,1,2};
        int count0=0, count1=0, count2=0;

        sorting(arr);
        System.out.println("Sorted:"+Arrays.toString(arr));


    }
}
