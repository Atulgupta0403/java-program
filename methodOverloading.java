class calc
{
    public int add(int n1,int n2){
        int res=n1+n2;
        return res;
    }
    public int multi(int n1,int n2){
        int res=n1*n2;
        return res;
    }
    public double add(double n1,double n2){
        double res=n1+n2;
        return res;
    }
    public int add(int n1,int n2,int n3){
        int res = n1+n2+n3;
        return res;
    }
}
class methodOverloading{
    public static void main(String[] args){
        calc obj = new calc();
        int res1=obj.add(3, 5);
        int res2=obj.multi(3, 5);
        int res4=obj.add(1,2,3);
        double res3=obj.add(5.4,3.20);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
