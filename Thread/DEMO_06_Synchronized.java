class CBank{
    private static int sum = 0;
    //利用 synchronized 可控制此區塊一次只有一個執行緒會執行
    //不會有兩個執行緒同時執行這一個地方
    public synchronized static void add(int n){
        int tmp = sum;
        tmp += n;

        try{
            Thread.sleep((int)(1000 * Math.random()));
        }catch(InterruptedException e){}
        sum = tmp;
        System.out.println("sum = " + sum);
    }
}

class CCustomer extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            CBank.add(100);
        }
    }
}

public class DEMO_06_Synchronized{
    public static void main(String args[]){
        CCustomer c1 = new CCustomer();
        CCustomer c2 = new CCustomer();
        c1.start();
        c2.start();
    }
}
