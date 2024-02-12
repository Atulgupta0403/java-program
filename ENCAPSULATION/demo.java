package ENCAPSULATION;

public class demo {
    private int age;
    private String name ;

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void show(){
        System.out.println(name +" "+age);
    }
    // // public class launch {
    //     public static void main(String[] args){
    //         demo obj = new demo();
            
    //         obj.setAge(15);
    //         // obj.getAge();
    //         obj.setName("atul");
    //         obj.getName();
    //         obj.show();
    //     }
    // // }
    
}

