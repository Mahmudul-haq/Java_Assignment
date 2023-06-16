import java.util.Arrays;

public class fouthProgram {
    public static void main(String[] args) {
        int arr[]={1,6,9,3,5,4,7};
        Arrays.sort(arr);
        boolean flag=false;
        int key=9;
        int l=0;
        int h= arr.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if (arr[m]==key){
                System.out.println("Element is found");
                flag=true;
                break;
            }
            if(arr[m]<key){
                l=m+1;
            }
            if(arr[m]>key){
                h=m-1;
            }
        }
        if(flag==false){
            System.out.println("Element is not found..");
        }
    }
}
