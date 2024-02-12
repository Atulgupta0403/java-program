package ENCAPSULATION;

public class Static {
    static int a,b;
    int m,n;

    static{
        System.out.println("you are in static");
        a=10;
        b=20;
    }

    {
        System.out.println("You are in instance");
        m=30;
        n=40;
    }

    static void disp1(){
        System.out.println(a);
        System.out.println(b);
    }

    void disp2(){
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args){
        
        
        Static obj = new Static();
        Static.disp1();
            obj.disp2();

        
    }
    
}
