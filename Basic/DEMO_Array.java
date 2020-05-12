public class DEMO_Array{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int i;
        //直觀寫法
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //簡易寫法
        for(int t:arr){
            System.out.println(t);
        }
    }
}
