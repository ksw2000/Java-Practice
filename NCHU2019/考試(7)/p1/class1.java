package p1;
import p2.class2;
public class class1{
    public static void main(String args[]){
        String str,ans1;
        int num;
        num=Integer.parseInt("123");
        System.out.println(num);
        ans1="因為Integer被定義成static，不用new就可以直接取用";
        System.out.println(ans1);
        StringBuffer str1=new StringBuffer("rainy & sunny");
        str1.replace(0,5,"windy");
        System.out.println(str1);
        class2 cc=new class2();
        cc.show();
    }
}
