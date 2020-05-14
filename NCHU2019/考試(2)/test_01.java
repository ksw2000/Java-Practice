import java.util.Scanner;
public class test_01 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("N=");
		int N=input.nextInt();
		System.out.print("M=");
		int M=input.nextInt();
		int arr[][]=new int[10][10];
		int i,j,num=1,times=0;
		while(true){
			if(times%4==0){
				j=times/4;
				for(i=times/4; i<=N-times/4-1; i++){
					if(M==1)
						arr[i][j]=num;
					else if(M==0)
						arr[j][i]=num;
					num++;
				}
			}else if(times%4==1){
				i=N-times/4-1;
				for(j=times/4+1;j<=N-times/4-1; j++){
					if(M==1)
						arr[i][j]=num;
					else if(M==0)
						arr[j][i]=num;
					num++;
				}
			}else if(times%4==2){
				j=N-1-times/4;
				for(i=N-2-times/4; i>=times/4; i--){
					if(M==1)
						arr[i][j]=num;
					else if(M==0)
						arr[j][i]=num;
					num++;
				}
			}else if(times%4==3){
				i=times/4;
				for(j=N-2-times/4; j>=times/4+1; j--){
					if(M==1)
						arr[i][j]=num;
					else if(M==0)
						arr[j][i]=num;
					num++;
				}
			}
			times++;
			if(num>N*N){
				break;
			}
		}
		for(i=0;i<N; i++){
			for(j=0; j<N; j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
