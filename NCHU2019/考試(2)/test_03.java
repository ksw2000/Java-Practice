import java.util.Scanner;
public class test_03 {
	public static int check(char a,char b){
		//a:97 z:122 A:65 Z:90
		int ia=0,ib=0;

		if((a>=97 && a<=122)||(a>=65 && a<=90)){
			if(a>=97 && a<=122){
				ia=a-32;
			}else{
				ia=a;
			}
		}
		if((b>=97 && b<=122)||(b>=65 && b<=90)){
			if(b>=97 && b<=122){
				ib=b-32;
			}else{
				ib=b;
			}
		}

		if(ia!=0 && ib!=0 && (ia==ib)){ //英文字母相同
			return 1; //del
		}else if(a==b){ //字元相同
			return 1;
		}else{	//兩者不同
			return 0; //don't del
		}
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a paragraph of text:");
		String line,del;
		line=input.nextLine();
		System.out.println("input deleted charcaters");
		del=input.nextLine();
		int i=line.length(),j=del.length();
		i=i-1;
		char c,d;
		int flag=0;
		while(true){
			c=line.charAt(i);
			for(int k=0; k<j; k++){
				d=del.charAt(k);
				flag+=check(c,d);
			}
			if(flag==0){
				System.out.print(c);
			}else{
				flag=0;
			}

			if(i==0){
				break;
			}
			else{
				i--;
			}
		}
	}
}
