/*
    1. 抽象類不能夠生成物件，因為該物件有可能會調用到「抽象函數」，而其「無函數實體」，所以無法執行。
    2. 如果一個類當中包含有一個或一個以上的抽象函數的話，那麼這個類必須被聲明為抽象類。
    3. 即使一個類當中沒有抽象函數，那麼這個類也可以被聲明為抽象類。
    4. 如果子類繼承抽象父類後，無覆寫父類中的抽象函數者，而該子類也必須變成抽象類，不然就需去覆寫之。

    抽象類是有建構函數的，因如子類去繼承並覆寫抽象函數後，其於生成子類物件時，還是會利用 super 去調用父類的建構函數。
    http://peimei0808.pixnet.net/blog/post/132134216-%5Bjava%5D-抽象類與函數的基本語法介紹
*/

abstract class Abstract_Circle{
    public int radius;
    public abstract double getArea();
}

class Implement_Abstract_Circle extends Abstract_Circle{
    private int radius;
    final private double PI = 3.14;
    public void setRadius(int r){
        this.radius = r;
    }

    public double getArea(){
        return this.radius * this.radius * PI;
    }
}

public class DEMO_07_Abstract{
    public static void main(String[] args){
        Implement_Abstract_Circle i = new Implement_Abstract_Circle();
        i.setRadius(10);
        System.out.println(i.getArea());
    }
}
