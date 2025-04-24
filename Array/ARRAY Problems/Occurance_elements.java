public class Occurance_elements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Elements occurance:");

        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==-1)
            continue;
            int count =1;
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }

            }
            System.out.println(arr[i] + " -> " + count);
        }




    }
}