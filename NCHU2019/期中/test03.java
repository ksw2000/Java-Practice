import java.util.Scanner;
class Teacher{
	protected char discAns;
	private int number;
	public Teacher(int numberAns) {
		number=numberAns;
	}
	public void show() {
		System.out.printf("The destination of the %dth move is %c-rod",number,discAns);
	}
}
class Student extends Teacher{
	private int numIneed;
	int step=0;
	public Student(int v) {
		super(v);
		numIneed=v;
		hanoi(5,'A','B','C');
	}
	public void hanoi(int n, char a, char b,char c) {
		if(n>=1) {
			hanoi(n-1,a,c,b);
			step++;
			System.out.printf("%d: Move disc %d from %c to %c\n",step,n,a,c);
			if(step==numIneed) {
				discAns=c;
			}
			hanoi(n-1,b,a,c);
		}
	}
}
public class test03 {
	public static void main(String[] args) {
		Scanner N=new Scanner(System.in);
		Student a=new Student(N.nextInt());
		a.show();
	}
}
