import java.io.*;
import java.util.*;

public class DEMO_ReadFile_Scanner{
    public static void main(String args[]){
        try{
            File fr=new File("../DEMO_ReadFile_Scanner.java");
            Scanner input = new Scanner(fr);
            while(input.hasNextLine()){
                //可配合
                //next() nextInt() nextLine() 做抓取
                System.out.println(input.nextLine());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
