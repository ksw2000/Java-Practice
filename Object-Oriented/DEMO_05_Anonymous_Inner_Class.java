public class DEMO_05_Anonymous_Inner_Class{
    public static void main(String[] args){
        // 匿名內部類別可建立不具名稱的物件
        int x=(new Anonymous_class(){
            int pi=3;
            void set_num(int n){
                    num=n;
                    System.out.println("num="+num);
                }
            }
        ).pi;
        System.out.println(x);
    }

    static class Anonymous_class{
        int num;
    }
}
