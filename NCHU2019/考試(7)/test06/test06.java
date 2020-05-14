package test06;
import java.util.Scanner;
public class test06{
    public static void main(String args[]){
        Scanner scn1=new Scanner(System.in);
        System.out.println("Input two numbers");
        int N=scn1.nextInt();
        int M=scn1.nextInt();
        Func func1=new Func();
        try{
            func1.div1(N,M);
        }catch(ArithmeticException e){
            func1.div2(N,M);
        }finally{

        }
        scn1.close();
    }
}

class Func{
    final void div1(int N,int M) throws ArithmeticException{
        float result=N/M/0;
        System.out.printf("result: %f",result);
    }
    final void div2(int N,int M){
        float result=(float)N/(float)M;
        System.out.printf("result: %f",result);
    }
}
