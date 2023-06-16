public class ThirteenProgram {
    public static void main(String[] args) {
        int num=12345;
        String str=Integer.toString(num);
        String value="";
        char character;
        for(int i=0;i<str.length();i++){
            character=str.charAt(i);
            value=character+value;
        }
        System.out.println("Reverse of the number : "+value);

    }
}
