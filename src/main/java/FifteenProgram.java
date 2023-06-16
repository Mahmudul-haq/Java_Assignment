import java.util.Locale;

public class FifteenProgram {
    public static void main(String[] args) {
        String input = "My country is Bangladesh";
        String[] arr = input.split(" ");
        int len = arr.length;
        input = input.toLowerCase();

        int vowels = 0, consonant = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonant++;
            }

        }
        int charac=vowels+consonant;
        System.out.println("Number of words "+len);
        System.out.println("Number of chars without spaces "+charac);
        System.out.println("Numbers of vowels "+vowels);
        System.out.println("Number os consonant "+consonant);
    }
}
