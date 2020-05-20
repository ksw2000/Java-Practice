import java.util.Scanner;
public class test01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("input n and m:");
		int n=input.nextInt();
		int m=input.nextInt();
		int[][] arr=new int[n][n];
		int i,j;
		int line=0,kind=0,again=0,all=n*n,last=n-1;
		
		//all loop
		for(i=1; i<=all; i++){
			if(kind==0){
				arr[line][again+line]=i;
			}else if(kind==1) {
				arr[line+again][last-line]=i;
			}else if(kind==2) {
				arr[last-line][last-line-again]=i;
			}else if(kind==3) {
				arr[last-again-line][line]=i;
			}
			//change kind
			if(again>n-3-2*line) {
				again=0;
				if(kind==3) {
					kind=0;
					line++;
				}else {
					kind++;
				}
				
			}else {
				again++;
			}
		}
		
		//print result
		
		for(i=0; i<n; i++){
			for(j=0; j<n;j++){
				if(m==0) {
					System.out.printf("%2d " ,arr[i][j]);
				}else if(m==1) {
					System.out.printf("%2d " ,arr[j][i]);
				}
			}
			System.out.print("\n");
		}
		

	}
}
