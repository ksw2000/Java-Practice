public class DEMO_Exception{
    public static void main(String args[]){
        System.out.println("example1:");
        // 一般配合 try-catch 使用
        try{
            int arr[]=new int [5];
            arr[10]=7;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound!");
            System.out.println("Exection = " + e);
            e.printStackTrace();
        }finally{
            System.out.println("This line is always executed!");
        }
        System.out.println("\n\nexample2:");

        //throw 拋出例外
        int a=4,b=0;
        try{
            if(b==0){
                throw new ArithmeticException();
            }else{
                System.out.println(a + "/" + b + " = " + a/b);
            }
        }catch(ArithmeticException e){
            System.out.println(e + " throwed");
        }

        System.out.println("\n\nexample3:");

        // 如果函數內的程式碼可能會發生例外，且函數內又沒有使用任何的
        // try-catch-finally 區塊去捕捉這些例外時
        // 可以在定義函數時指明所有可能發生的例外

        try{
            div(4, 0);
        }catch(ArithmeticException e){
            System.out.println(e+" throwed");
        }
    }

    public static void div(int a,int b) throws ArithmeticException{
        int c;
        c = a / b;
        System.out.println(a + "/" + b + " = " + c);
    }
}
