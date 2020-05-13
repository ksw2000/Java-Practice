class PartyAnimal_Runnable implements Runnable{
    private String id;

    public PartyAnimal_Runnable(String str){
        this.id = str;
    }

    public void run(){
        for(int i=0; i<4; i++){
            for(int j=0; j<100000000; j++);
            System.out.println(this.id + " is running..");
        }
    }
}

public class DEMO_02_Runnable{
    public static void main(String ars[]){
        PartyAnimal_Runnable dog = new PartyAnimal_Runnable("doggy");
        PartyAnimal_Runnable cat = new PartyAnimal_Runnable("kitty");

        Thread t1 = new Thread(dog);
        Thread t2 = new Thread(cat);
        t1.start();
        t2.start();
    }
}
