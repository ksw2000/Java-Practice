import java.util.Scanner;
public class test_02{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int input_n,input_m;
        System.out.print("N=");
        input_n=input.nextInt();
        System.out.print("M=");
        input_m=input.nextInt();
        Number print=new Number(input_n,input_m);
        print.draw();

    }
}

class Number{
    int N;
    int M;
    public Number(int N, int M){
        this.N=N;
        this.M=M;
    }
    public void draw(){
        int arr[][]=new int[N][M];
        int sum=N*M;
        int now_number=1;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i%2==1){
                    arr[i][M-1-j]=now_number;
                }else{
                    arr[i][j]=now_number;
                }
                now_number++;
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]<10){
                    System.out.print(" "+arr[i][j]+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
