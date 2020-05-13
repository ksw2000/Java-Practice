class Zoo extends Thread{
    private String id;
    public Zoo(String str){
        this.id = str;
    }
    public void run(){
        for(int i=0; i<4; i++){
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }finally{
                System.out.println(id + " is running.. Priority " + this.getPriority());
            }
        }
    }
}

public class DEMO_04_setPriority{
    public static void main(String args[]){
        Zoo dog    = new Zoo("doggy");
        Zoo cat    = new Zoo("kitty");
        Zoo rabbit = new Zoo("rabbit");
        Zoo sheep  = new Zoo("sheep");
        Zoo horse  = new Zoo("horse");

        //設定執行優先順序
        cat.setPriority(Thread.MAX_PRIORITY);
        dog.setPriority(Thread.MIN_PRIORITY);
        rabbit.setPriority(7);
        horse.setPriority(3);

        dog.start();
        cat.start();
        rabbit.start();
        sheep.start();
        horse.start();
    }
}
