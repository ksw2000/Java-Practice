class DEMO_Join extends Thread{
    private String id;
    public DEMO_Join(String str){
        this.id = str;
    }
    public void run(){
        for(int i=0; i<4; i++){
            System.out.println(id + " is running..");
        }
    }
}

public class DEMO_05_Join{
    public static void main(String[] args){
        DEMO_Join dog = new DEMO_Join("doggy");
        DEMO_Join cat = new DEMO_Join("kitty");
        dog.start();
        try{
            dog.join();   //等dog執行完再執行下一行
            cat.start();
            cat.join();
        }catch(InterruptedException e){}
        System.out.println("main() finished");
    }
}
