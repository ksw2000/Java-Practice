public class DEMO_04_Nested_Classes{
    public static void main(String[] args){
        Nested aa = new Nested();
        aa.set_num(5);
    }
    static class Nested{
        int num;
        void set_num(int n){
            this.num=n;
            System.out.println("num = " + num);
        }
    }
}
