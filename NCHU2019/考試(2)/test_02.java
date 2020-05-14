import java.util.Scanner;
public class test_02 {
	public static int gcd(int big, int small){
		if(small!=0)
			return gcd(small,big%small);
		else
			return big;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("input two number:");
		int big,small,tmp;
		big=input.nextInt();
		small=input.nextInt();
		if(big<small){
			tmp=big;
			big=small;
			small=tmp;
		}
		if(big==0 || small==0){
			System.out.println("Error");
		}else{
			System.out.println(gcd(big,small));
		}

	}
}
