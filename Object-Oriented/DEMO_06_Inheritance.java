public class DEMO_06_Inheritance{
    public static void main(String[] args){
        CCoin ccoin = new CCoin();

        //protected 可被繼承，private則不行
        System.out.println(ccoin.sqrt2);

        //透過父類別呼叫自類別的函數
        ccoin.setRadius(10);
        ccoin.show();

        //當父子兩類別有相同函數時，優先執行子類別
        ccoin.demoOverride();

        CCoin ccoinForSuper = new CCoin(0);
        ccoinForSuper.cannotExtend();
    }
}

class CCircle{
    private static double pi = 3.14;
    private double radius;
    protected double sqrt2 = 1.414;
    protected double sqrt3;

    //常見錯誤
    //一定要加，因為在呼叫CCoin前會先呼叫CCircle，即使什麼東西都沒有也要加
    public CCircle(){
        System.out.println("無引數的父建構元已被呼叫");
    }

    public CCircle(int r){
        System.out.println("有引數的父建構元已被呼叫");
    }

    public void setRadius(double r){
        radius = r;
        System.out.println("radius = " + radius);
    }

    public void show(){
        System.out.println("area = " + pi*radius*radius);
    }

    public void demoOverride(){
        System.out.println("In parent");
    }

    public final void cannotExtend(){
        //設定 final 的 函數 無法進行 Override

        //設定 final 的 class 無法被繼承
        //比如 java.lang.String 就是一個 final class

        //設定 final 的變數作用如同 C 中的 const 但 Java 中少用 const (仍為保留字)
        System.out.println("The means of final");
    }
}

class CCoin extends CCircle{
    public CCoin(){
        super(); // 可省略
    }
    public CCoin(int in){
        super(in);
        super.sqrt3 = 1.732;  //super.variable 可設定父類別的資料成員
    }
    public void demoOverride(){
        System.out.println("In son");
    }
}
