import java.util.Scanner;
public class test_03{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int height;
        System.out.println("Input the height of Pascal Triangle");
        height=input.nextInt();
        draw_Pascal p=new draw_Pascal(height);
        p.draw();
    }
}

class draw_Pascal{
    int H;
    draw_Pascal(int H){
        this.H=H;
    }

    public void draw(){
        int array[][]=new int[H][H];
        for(int i=0;i<H;i++){
            for(int j=0;j<H;j++){
                if(i==0){
                    array[0][0]=1;
                }else{
                    if(j==0){
                        array[i][0]=1;
                    }else{
                        array[i][j]=array[i-1][j-1]+array[i-1][j];
                    }
                }

            }
        }
        for(int i=0;i<H;i++){
            for(int k=0; k<H-(i+1); k++){
                System.out.print("    ");
            }
            for(int j=0;j<H;j++){
                if(array[i][j]!=0){
                    System.out.printf("%4d    ",array[i][j]);
                }
                /*
                不用 printf 的替代方法
                if(array[i][j]!=0){
                    if((j+1)<H){
                        if(array[i][j]<100 && array[i][j+1]>=100){
                            System.out.print(array[i][j] + "     ");
                        }else if(array[i][j+1]>=100){
                            System.out.print(array[i][j] + "     ");
                        }else if(array[i][j]<10 && array[i][j+1]>=10){
                            System.out.print(array[i][j] + "      ");
                        }else if(array[i][j+1]>=10){
                            System.out.print(array[i][j] + "      ");
                        }else{
                            System.out.print(array[i][j] + "       ");
                        }
                    }else{
                        System.out.print(array[i][j] + "       ");
                    }
                }
                */
            }
            System.out.print("\n");
        }

    }
}
