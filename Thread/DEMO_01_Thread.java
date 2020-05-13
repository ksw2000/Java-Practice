class PartyAnimal extends Thread{
    private String id;
    public PartyAnimal(String str){
        this.id = str;
    }

    @Override
    public void run(){
        for(int i=0; i<4; i++){
            for(int j=0; j<100000000; j++);
            System.out.println(id + " is running..");
        }
    }
}

public class DEMO_01_Thread{
    public static void main(String[] args){
        PartyAnimal dog = new PartyAnimal("doggy");
        PartyAnimal cat = new PartyAnimal("kitty");
        dog.start();
        cat.start();
    }
}
