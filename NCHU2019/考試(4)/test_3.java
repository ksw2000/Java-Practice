import java.util.Scanner;
public class test_3{
    public static void main(String[] args){
        System.out.print("Input the height of the hanoi tower:");
        Scanner N=new Scanner(System.in);
        Student a=new Student(N.nextInt());
        a.show();
    }
}

class Teacher{
    char destinate;
    private int number;
    public Teacher(int get_num){
        number=get_num;
    }
    public void show(){
        System.out.print("第"+number+"次移動的目的為"+destinate);
    }
}
class Student extends Teacher{
    static int i=1;
    private int i_want;
    public Student(int v){
        super(v);
        i_want=v;
        hanoi(5,'A','B','C');
    }

    public void hanoi(int n,char A,char B, char C){    // A:FROM B:過程 C:TO
        if(n>0){
            hanoi(n-1,A,C,B); //A->B
            System.out.println(i+": Move dics "+n+" from "+A+" to "+C); //A->C
            if(i==i_want){
                destinate=C;
            }
            i++;
            hanoi(n-1,B,A,C); //B->C
        }
    }
}
