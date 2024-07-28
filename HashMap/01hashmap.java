import java.util.*;

class HashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        
        // put()
        hashmap.put(1,"atul");
        hashmap.put(2,"gupta");
        hashmap.put(3,"Aditya");
        System.out.println(hashmap);
        
        // remove()
        hashmap.remove(2);
        System.out.println("Updated hashmap " + hashmap);
        
        // get()
        String res = hashmap.get(1);
        System.out.println(res);
        
        // containsKey()
        System.out.println(hashmap.containsKey(1));
        
        // entrySet()
        for(Map.Entry<Integer,String> e : hashmap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        
    }
}