public class test03{
    public static void main(String args[]){
        String a=new String("222");
        String b=new String("222");
        System.out.printf("%b\n", a.equals(b));
        System.out.println("此equals()用來比較兩者之間的內容因為a和b都是222所以回傳true，若我將其中一個改成223，就會變成false了");

        AA a1=new AA();
        AA a2=new AA();
        System.out.printf("%b\n",a1.equals(a2));
        System.out.println("此equals()用來比較兩個變數是否指向同一個物件，因為a1和a2是如同中國與台灣兩相獨立的兩個物件，所以回傳false");
    }
}

class AA{
    int a=0;
}
