public class SixteenProgram {
    public static void main(String[] args) {
        String input="ROADTOSDET";
        int len=input.length();
        input=input.toUpperCase();

        for(int i=0;i<len;i++){
            char ch=input.charAt(i);
            int aski=(int)ch;
            aski=aski+5;
            ch=(char)aski;
            System.out.print(ch);

        }


    }
}
