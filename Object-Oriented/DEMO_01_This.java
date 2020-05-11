public class DEMO_01_This{
    public static void main(String args[]){
        CBox box = new CBox();
        box.show_all();
    }
}

class  CBox{
    int length;
    int width;
    int height;
    void show_all(){
        this.length=15;
        this.width=10;
        this.height=25;
        System.out.println("length = " + this.length);
        System.out.println("width = " + this.width);
        System.out.println("height = " + this.height);
    }
}
