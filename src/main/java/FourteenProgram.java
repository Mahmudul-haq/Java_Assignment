public class FourteenProgram {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,4,5,6,4};
        int i,j,count=0;
        for(i=0;i< arr.length;i++)
        {
            for(j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate value:"+ arr[i]+ " is at index"+ j);
                }
            }
        }

    }
}
