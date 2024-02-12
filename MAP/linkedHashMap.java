package MAP;
import java.util.*;
public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put(1,"Atul");
        lhm.put(2,"Aditya");
        lhm.put(3,"AAAA");
        lhm.put(null,null);

        System.out.println(lhm);

        System.out.println(lhm.size());
    }
}
