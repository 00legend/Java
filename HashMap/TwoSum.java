import java.util.*;

public class TwoSum {
public static int[] twosum(int[] num,int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < num.length; i++) {
        int c = target - num[i];

        if(map.containsKey(c)){
            return new int[] {map.get(c),i};

        }
        map.put(num[i],i);

    }
    return new int[] {};

}
    public static void main(String[] args) {
    int[] num = {1,2,3,4,5,6,7,8,9,0};
    int target =5;
    twosum(num, target);
        System.out.println( Arrays.toString( twosum(num, target)));



    }
}
