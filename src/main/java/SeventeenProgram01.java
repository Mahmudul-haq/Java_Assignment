import java.util.Scanner;

public class SeventeenProgram01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.next();
        String reverseStr="";
        int len=value.length();
        for(int i=len-1;i>=0;i--){
            reverseStr=reverseStr+value.charAt(i);
        }
        //System.out.println(reverseStr);
        if(value.equals(reverseStr)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
