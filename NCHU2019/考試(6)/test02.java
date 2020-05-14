public class test02{
    public static void main(String[] args){
        Compute com1=new Compute();
        Compute com2=new Compute();
        com1.mul1();
        com1.show();    //3*11*3.14=103.62
        com1.a=7;
        com2.mul1();
        com2.show();    //7*11*3.14=241.78
    }
}
class Math{
    //增加兩行且只能宣告
    final protected double pi=3.14;
    protected double ans;
    public void show(){
        System.out.println("ans="+ans); //修改此行
    }
}

class Compute extends Math{
    static double a=3;
    static double b=11;
    int pi=5;
    public void mul1(){
        ans=a*b*super.pi; //pi in Math
    }
    public void mul2(){
        ans=a*b*this.pi; //pi in Compute
    }
}
