import java.util.Arrays;

public class ElevenProgram {
    public static void main(String[] args) {
        int arr[]={5,3,9,7,4,1,8};
        Arrays.sort(arr);
        int len=arr.length;
        System.out.println(arr[len-2]);
    }
}
