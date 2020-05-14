public class DEMO_08_Wait_and_Notify{
    public static void main(String args[]){
        Cookies cookies = new Cookies();
        Put put = new Put(cookies);
        Eat eat = new Eat(cookies);
        Thread dog = new Thread(eat);
        Thread master = new Thread(put);
        dog.start();
        master.start();
    }
}

class Cookies{
    private int cookiesNo;
    //加入boolean empty 偵測盤子是否為空
    private boolean empty = true;
    public synchronized void put(int cNo){
        while(!empty){  //如果不是空的
            try{
                wait();
            }catch(InterruptedException e){}
        }
        System.out.println("主人放了第 " + cNo + " 塊餅乾.");
        cookiesNo = cNo;
        empty = false; //裝完餅乾 現在不是空的
        notify();
    }

    public synchronized void eat(int cNo){
        while(empty){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        System.out.println("小白狗吃了第 " + cNo + " 塊餅乾.");
        cookiesNo = cNo;
        empty = true;     //狗吃完了 現在是空的
        notify();
    }
}

class Eat implements Runnable{
    Cookies cookies;
    Eat(Cookies cookies){
        this.cookies = cookies;
    }
    public void run(){
        for(int i=1; i<=10; i++){
            cookies.eat(i);
        }
    }
}

class Put implements Runnable{
    Cookies cookies;
    Put(Cookies cookies){
        this.cookies = cookies;
    }
    public void run(){
        for(int i=1; i<=10; i++){
            cookies.put(i);
        }
    }
}
