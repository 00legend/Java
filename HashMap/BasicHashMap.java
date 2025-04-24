import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();

        h.put(1, "Apple");
        h.put(2, "Bannana");
        h.put(3, "Orange");
        h.put(4, "grapes");
        h.put(5, "mango");


   ;

//           for (Map.Entry<Integer,String> e : h.entrySet()){
//
//               System.out.println(e.getKey()+" "+e.getValue());
//
//           }
////        System.out.println(h.getKey()+"  "+e.getValue());


//      //  h.remove(2);
//        System.out.println(h.get(2));

        String str= "Apple";
           HashMap<Integer,String> map = new HashMap<>();

         for(int i = 0 ; i<str.length();i++){
             char c = str.charAt(i);
             System.out.println(str.charAt(i));

             map.put(c, map.getOrDefault())
         }


    }
}