public class compress {
    public static void main(String[] args) {
        String s = "aaaabbbbcccdd";
        String s1 = "";

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!s1.contains(ch + "")) {
                s1 = s1 + ch;
            }
        }
        System.out.println(s);
        for(int i=0;i<s1.length();i++) {
           char ch = s1.charAt(i);
           int counter = 0;
           for(int j=0;j<s.length();j++) {
            if(s.charAt(j) == ch) {
                counter++;
            }
           }
           System.out.print(ch +"" + counter);
        }
    }
}
