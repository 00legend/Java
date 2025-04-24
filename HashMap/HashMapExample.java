import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String,Integer> map =new HashMap<>();

        map.put("petrol", 100);
        map.put("desiel",110);
        map.put("LNG",50);
        Integer h = map.put("newpetrol", 10);
        map.put("GAS", 800);
        map.get("GAS");

//        System.out.println(map.get("petrol"));

        // for loop in HashMap
//     for(Map.Entry<String,Integer> e:map.entrySet()){
//         System.out.println(e.getKey());
//         System.out.println(e.getValue());
//     }
//
//        // for loop using set
//        Set<String> keys = map.keySet();
//        for(String key : keys){
//            System.out.println(key+" -> "+map.get(key));
//
//        }

        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getKey().equals("GAS")){
                e.setValue(5000);
                System.out.println(e.getKey()+" -> "+e.getValue());


            }
        }


        // METHODS IN HASHMAP

//        System.out.println(map.get("petrol"));


    }
}
