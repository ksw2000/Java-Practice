import java.util.Scanner;
class parent{
    public int height;
    public void show(){
        
    }
}
class child extends parent{
    public child(int a){
        height=a;
    }
    public void show(){
        int height=super.height;
        for(int h=1; h<=height; h++){
            int t=1,condition;
            condition=(h<=(height+1)/2)? h:height-h+1;
            while(t<=condition){
                System.out.print(t);
                t++;
            }
            System.out.println();
        }
    }
}
public class test_1{
    public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        child ch=new child(N);
        ch.show();
    }
}
