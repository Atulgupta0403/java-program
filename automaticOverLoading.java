class calc{
    public void show(byte n){
        System.out.println("byte "+n);
    }
    public void show(short n){
        System.out.println("short "+n);
    }
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(long n){
        System.out.println("long "+n);
    }
}
public class automaticOverLoading{
    public static void main(String[] args){
        calc obj = new calc();
        byte b=2;
        obj.show(b);
        obj.show(2);
        obj.show('A');


    }
}