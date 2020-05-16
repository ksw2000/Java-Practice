import java.io.*;
public class DEMO_WriteFile{
    public static void main(String args[]){
        try{
            FileWriter myWriter = new FileWriter("DEMO_WriteFile.txt");
            myWriter.write("闇の力を秘めし鍵よ、真の姿を我の前に示せ、契約のもと、さくらが命じる");
            myWriter.write("、レリーズ");
            //第二個 write()會接著檔尾寫，第一個 write() 則是覆寫
            myWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
