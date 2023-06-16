public class FiveProgram {
    public static void main(String[] args) {
        int  arr[]={1,6,9,3,5,4,7};
        int key=5;
        boolean count=false;
        for(int i=0;i< arr.length;i++)
        {
            if(key == arr[i]){
                count=true;
            }
        }
        if(count){
            System.out.println("Key is found");
        }
        else{
            System.out.println("Key is not found");
        }
    }
}
