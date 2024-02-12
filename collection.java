// package collection;
import java.util.*;
public class collection {
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);

        // al.add(300);
        // al.add(400);
        // al.add(400);
        // al.add(400);
        // al.add("Atul Gupta");
        // al.add(1.1234);
        // al.add(2,"Atul");

        System.out.println(al);

        System.out.println("*****************************************");
        
        ArrayList a2=new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        
        al.add(a2);
        
        System.out.println(al);
        
        System.out.println("*****************************************");

        al.addAll(a2);


        System.out.println(al);

        System.out.println("*****************************************");


        TreeSet ts=new TreeSet<>();
        ts.add(200);
        ts.add(100);
        ts.add(300);
        ts.add(400);
        ts.add(400);
        ts.add(400);
        al.add("Atul Gupta");


        System.out.println(ts);
    }
}
