public class DEMO_03_Lambda_Expression{
    public static void main(String ars[]){
        Runnable cat = new Runnable(){
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("cat: cat is running..");
                }
            }
        };
    /*
        Runnable cat = new p();
        class p implements Runnable{
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("cat: cat is running..");
                }
            }
        }
    */

        /**** Lambda Expression ****/
        Thread t1 = new Thread(()->{
            for(int i=0; i<4; i++){
                System.out.println("t1: dog is running..");
            }
        });
    /*
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("t1: dog is running..");
                }
            }
        });
    */

        Thread t2 = new Thread(cat);
    /*
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("cat: cat is running..");
                }
            }
        });
    */
        t1.start();
        t2.start();

        /**** Lambda Expression ****/
        Runnable t3 = () -> System.out.println("t3: sheep is running..");
    /*
        Runnable t3 = new Runnable(){
            public void run(){
                System.out.println("t3: sheep is running..");
            }
        }
    */
        new Thread(t3).start();
    /*
        new Thread(new Runnable(){
            public void run(){
                System.out.println("t3: sheep is running..");
            }
        }).start();
    */
    }
}
