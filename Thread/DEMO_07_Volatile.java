public class DEMO_07_Volatile{
    public static void main(String args[]){
        Thread thread1 = new Thread(()->{
            while(true){
                Variable.one();
            }
        });

        Thread thread2=new Thread(()->{
            while(true){
                Variable.two();
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Variable{
    //volatile 可以阻止編譯器進行變數的最佳化
    //若不使用 volatile 則若兩個執行緒同時對同一個變數動作時就會出錯
    volatile static int i=0,j=0;
    static void one(){
        i++;
        j++;
    }
    static void two(){
        System.out.printf("i=%d, j=%d%n",i,j);
    }
}
