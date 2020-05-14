public class main1{
    public static void main(String[] args){
        CMember<String,Integer> a=new CMember<String,Integer>();
        CMember<Integer,String> a1=new CMember<Integer,String>();
        String[] s={"four","five","three","one","two"};
        Integer[] s1={4,5,3,1,2};
        a.set(s,s1);
        a1.set(s1,s);
        a.show();
        System.out.println("\n");
        a1.show();
    }
}
class CMember<T,V>{
    T A[];
    V B[];
    public void set(T[] value1,V[] value2){
        A=value1;
        B=value2;
    }
    public void show(){
        for(int i=0; i<10; i++){
            if(i%2==0){
                System.out.print(B[i/2]+" : ");
            }else{
                System.out.println(A[(i-1)/2]);
            }
        }
    }
}
