import java.util.Scanner;
class Dog{
    int length = 20;
    int weight = 20;
    static int height = 20; //類別變數 宣告新物件時變數不重新改變
    String shit(){
        return "SHIT!";
    }
    public String bar(){
        String back = "WTF, Smell like ";
        back += this.shit();
        return back;
    }
}

public class DEMO_02_Static_Var{
	public static void main(String[] args){
        Dog fuck = new Dog();
        fuck.length = 100;
        fuck.height = 100;
        System.out.println("fuck.length " + fuck.length);
        System.out.println("fuck.height " + fuck.height);

        Dog fuck2 = new Dog();
        System.out.println("fuck2.length " + fuck2.length);
        System.out.println("fuck2.height " + fuck2.height);

        System.out.println(fuck2.bar());
	}
}
