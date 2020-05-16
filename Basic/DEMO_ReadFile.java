import java.io.*;
public class DEMO_ReadFile{
    public static void main(String args[]){
        try{
            FileReader fr=new FileReader("DEMO_ReadFile.java");
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
