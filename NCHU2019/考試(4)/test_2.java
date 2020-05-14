import java.util.Scanner;
public class test_2{
    public static void main(String[] args){
        Scanner scn_int=new Scanner(System.in);
        System.out.println("Please input two values:");
        int d1=scn_int.nextInt();
        int d2=scn_int.nextInt();
        A a1=new A();
        A a2=new A();
        a1.set_B(d1);
        a2.set_B(d2);
        C c=new C();
        int sub=c.subtract(a1,a2);
        System.out.println(sub);
        //scn_int.close;
    }
}
class A{
    private class B{
        int x;
        void set(int set_num){
            x=set_num;
        }
        int get(){
            return x;
        }
    }
    private B b=new B();
    public void set_B(int vv){
        b.set(vv);
    }
    public int get_B(){
        return b.get();
    }
}
class C{
    public int subtract(A a1, A a2){
        return (a1.get_B()-a2.get_B());
    }
}
