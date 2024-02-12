package ENCAPSULATION;

public class student {
    private int age;
    private String name;
    public void setData(){
        age=19;
        name="Atul";

    }
    public void show(){
        System.out.println(name +" "+ age);
    }
    public static void main(String[] args){
        student obj = new student();
        obj.setData();
        obj.show();
    
    }
}

