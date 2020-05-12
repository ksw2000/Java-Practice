public class DEMO_Exception_2{
    //自定義 Exception
    public static void main(String args[]){
        CCircle cir=new CCircle();
        try{
            cir.setRadius(-2.0);
        }catch(CCircleException e){
            System.out.println(e + " throwed");
        }
    }
}

class CCircleException extends Exception{

}

class CCircle{
    private double radius;
    public void setRadius(double r) throws CCircleException{
        if(r<0){
            throw new CCircleException();
        }else{
            this.radius=r;
        }
    }
    public void show(){
        System.out.println("area="+3.14*radius*radius);
    }
}
