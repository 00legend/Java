public class Duplicates {
    public static void main(String[] args) {

        int[] arr={1,2,1,2,3,2,3,5,6,1,2,3,8};
        int count=1;

        for (int i = 0 ; i<arr.length-1;i++){
            for (int j = i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println("i and j are :"+arr[i]+ " and "+arr[j]+ " From Index :"+i+","+j);
                }
            }
        }
    }
}
