import java.util.Scanner;
class test_01{
    public static void main(String[] args){
        int N=0;
        String plaintext=null;
        Scanner input=new Scanner(System.in);
        System.out.print("Input String: ");
        plaintext=input.nextLine();
        System.out.print("Input number of shifting: ");
        N=input.nextInt();
        Caesar sar= new Caesar(plaintext,N);
        sar.cipher();
    }
}

class Caesar{
    String result="";
    int ascii;
    public Caesar(String plaintext, int shift){
        char c;
        for(int i=0; i<plaintext.length(); i++){
            ascii=(int)plaintext.charAt(i);
            //a:97 z:122 A:65 Z:90
            if(ascii>=65 && ascii<=90){
                ascii=((ascii+shift)-65)%26+65;
            }else if(ascii>=97 && ascii<=122){
                ascii=((ascii+shift)-97)%26+97;
            }
            result=result+(char)ascii;
        }
    }
    public void cipher(){
        System.out.println(result);
    }
}
