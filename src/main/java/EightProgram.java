public class EightProgram {
    public static void main(String[] args) {
        int i,a=1,count;
        while(a<=100){
            count =0;
            i=2;
            while(i<=a/2){
                if(a%i==0){
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && a!=1)
            {
                System.out.println(a);
            }
            a++;
        }
    }
}
