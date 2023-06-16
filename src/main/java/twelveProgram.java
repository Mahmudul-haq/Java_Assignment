import java.util.Random;

public class twelveProgram {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        Random rand=new Random();
        int i;

        for(i=0;i< arr.length;i++){
            int valueSwap= rand.nextInt(arr.length);
            int temp=arr[valueSwap];
            arr[valueSwap]=arr[i];
            arr[i]=temp;
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
