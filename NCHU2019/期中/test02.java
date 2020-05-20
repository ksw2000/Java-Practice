import java.util.Scanner;
public class test02 {
	static int isBig(char a) {
		int ia=(int)a;
		if(ia>=65 && ia<=90) {
			return 1;
		}else {
			return 0;
		}
	}
	static int check(char a,char b) {
		int ia,ib;
		ia=(int)a;
		ib=(int)b;
		if(isBig(a)==1) {
			ia+=32;
		}
		if(isBig(b)==1) {
			ib+=32;
		}
		if(ia!=ib) {
			return 0;
		}else {
			return 1;
		}		
 	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//a-z=97~112 A-Z=65~90
		System.out.println("Please input a paragraph of text:");
		String str=input.nextLine();
		System.out.println("Please input deleted characters");
		String del=input.nextLine();
		int strLen=str.length();
		int delLen=del.length();
		int checkint=0;
		String result="";
		for(int i=0; i<strLen; i++) {
			for(int j=0; j<delLen; j++) {
				checkint+=check(str.charAt(i),del.charAt(j));
			}
			if(checkint>0) {
				checkint=0;
			}else {
				result+=str.charAt(i);
			}
		}
		for(int k=result.length()-1; k>=0; k--) {
			System.out.print(result.charAt(k));
		}
	}
}
