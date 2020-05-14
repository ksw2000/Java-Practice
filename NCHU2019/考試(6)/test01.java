import java.util.Scanner;
abstract class parent{
    abstract void show();
}
class child extends parent{
    protected int a;
    child(int A){
        a=A;
    }
    void show(){
        //1,3,5,7,9
        //5,7,9,11,13
        //...
        int s[]=new int[a+1];
        int t[]=new int[a+1];
        int s0=1;
        int t0=5;
        for(int i=0; i<a; i++){
            s[i]=s0+i*2;
            t[i]=t0+i*2;
        }
        s[a]=1;
        t[a]=1;
        int long_side=t[a-1];
        for(int j=0; j<a+1; j++){
            for(int k=0; k<(long_side-s[j])/2;k++){
                System.out.print(" ");
            }
            for(int l=0; l<s[j]; l++){
                System.out.print("*");
            }
            System.out.println();
            for(int m=0; m<(long_side-t[j])/2; m++){
                System.out.print(" ");
            }
            for(int n=0; n<t[j]; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class test01{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("輸入聖誕樹層數\n");
        int A;
        A=sc.nextInt();
        child ch =new child(A);
        ch.show();
    }
}
