public class DEMO_03_Construction_Element{
    public static void main(String[] args){
        DEMO_03_CCircle cirl = new DEMO_03_CCircle();
        cirl.show();
    }
}

class DEMO_03_CCircle{
    private String color;
    private double pi = 3.14;
    private double radius;
    public DEMO_03_CCircle(){
        this("Green", 1.0);
    }
    public DEMO_03_CCircle(String str, double r){
        this.color  = str;
        this.radius = r;
    }
    public void show(){
        System.out.println("color=" + color + ", radius=" + radius);
    }
}
