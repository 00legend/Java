public class Occurance_second {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,3,1,3,4,6,3,7,8,9,3};
        boolean[] visited = new boolean[arr.length];

        for (int i=0;i<arr.length;i++){
            if (visited[i]) {
                continue;

            }
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i] + " - " + count);
        }

    }
}
