/*
    在 interface 中變數必需為常數，函數必需使用抽象函數
    抽象函數內僅有定義，裡面沒有東西
    如 iShape2D 介面中的 area() 函數，僅有定義沒有內容(因此也不用花括號{})
*/

interface iShape2D{
    final double PI = 3.14;
    abstract void area();
}

class CCircle implements iShape2D{
    double radius;
    public CCircle(double r){
        radius = r;
    }
    public void area(){
        System.out.println("area = " + PI*radius*radius);
    }
}

public class DEMO_08_Interface{
    public static void main(String[] args) {
        CCircle cir = new CCircle(2.0);
        cir.area();
    }
}

/*
    整理
    https://coffee0127.github.io/blog/2016/09/10/abstract-class-vs-interface/

                         Abstract Class	                 Interface
父類別/父介面 繼承         只能繼承一個類別	                   能繼承多個介面 (Java實現多重繼承)
子類別 繼承/實作	        只能繼承(extends)一個抽象類別	      能實作 (implements) 多個介面
方法                     可包含非抽象方法	                   只能是抽象方法 (Java8以前…XD)
應用	                   關係密切的類別中                    定義一些功能給較不相干類別使用
                        必定為父類別	                      可視為抽象類別的特例
*/
