import java.util.Scanner;
public class test04 {
	static int size;
	static int mines;
	static int[][] answerTable;
	static String[][] displayTable;
	static int haveOpend=0;
	static void openZero(int i,int j) {
		for(int m=-1; m<=1; m++) {
			for(int n=-1; n<=1; n++) {
				if(i+m>=0 && i+m<size && j+n>=0 && j+n<size) { //不可超界
					if(displayTable[i+m][j+n]=="*") {
						if(answerTable[i+m][j+n]==0) {
							displayTable[i+m][j+n]="0";
							haveOpend++;
							openZero(i+m,j+n);
						}else {
							displayTable[i+m][j+n]=String.valueOf(answerTable[i+m][j+n]);
							haveOpend++;
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please input the shapes of the game and the number of mines: ");
		size=input.nextInt();
		mines=input.nextInt();
		//Math.random() 0~1 �ڭn 0~size mines��
		answerTable=new int[size][size];
		displayTable=new String[size][size];
		int minesTable[][]=new int[mines][2];

		for(int k=0; k<size; k++) {
			for(int m=0; m<size; m++) {
				answerTable[k][m]=0;
				displayTable[k][m]="*";
			}
		}


		//�I���u
		int i=0,arr_i,arr_j;
		while(i<mines){
			arr_i=(int)Math.floor(Math.random()*size);
			arr_j=(int)Math.floor(Math.random()*size);
			if(answerTable[arr_i][arr_j]!=-1) {
				answerTable[arr_i][arr_j]=-1;
				minesTable[i][0]=arr_i;
				minesTable[i][1]=arr_j;
				i++;
			}
		}

		//�s�@ Table
		int tmpi,tmpj;
		for(int k=0; k<mines; k++) {
			tmpi=minesTable[k][0];
			tmpj=minesTable[k][1];
			for(int m=-1; m<=1; m++) {
				for(int n=-1; n<=1; n++) {
					if(tmpi+m>=0 && tmpi+m<size && tmpj+n>=0 && tmpj+n<size) {
						if(answerTable[tmpi+m][tmpj+n]!=-1) {
							answerTable[tmpi+m][tmpj+n]+=1;
						}
					}
				}
			}
		}

		/*
		for(int k=0; k<size; k++) {
			for(int m=0; m<size; m++) {
				System.out.printf("%2d ",answerTable[k][m]);
			}
			System.out.println();
		}*/

		for(int k=0; k<size; k++) {
			for(int m=0; m<size; m++) {
				System.out.print(displayTable[k][m]+" ");
			}
			System.out.println();
		}

		int flag=0;	//flag==0 continue
		while(flag==0){
			System.out.print("Input coordinate:");
			int open_i=input.nextInt()-1;
			int open_j=input.nextInt()-1;
			if(answerTable[open_i][open_j]!=-1) {
				if(answerTable[open_i][open_j]==0) {
					openZero(open_i,open_j);
				}else {
					displayTable[open_i][open_j]=String.valueOf(answerTable[open_i][open_j]);
					haveOpend++;
				}
			}else{
				for(int n=0; n<mines; n++) {
					if(displayTable[minesTable[n][0]][minesTable[n][1]]=="*") {
						displayTable[minesTable[n][0]][minesTable[n][1]]="X";
					}
				}
				flag=1;
			}
			for(int k=0; k<size; k++) {
				for(int m=0; m<size; m++) {
					System.out.print(displayTable[k][m]+" ");
				}
				System.out.println();
			}
			if(haveOpend==size*size-mines && haveOpend!=0) {
				flag=2;
				break;
			}
		}
		if(flag==2) {
			System.out.println("Winner!");
		}else if(flag==1) {
			System.out.println("Game over!");
		}
	}
}
