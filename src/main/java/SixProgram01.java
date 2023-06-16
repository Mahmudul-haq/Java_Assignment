import java.util.Arrays;

public class SixProgram01 {
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100 + 1);
        }
        System.out.println("Numbers Generated: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Min numbers is :"+numbers[0]);
        System.out.println("Max numbers is :"+numbers[9]);
    }
}
