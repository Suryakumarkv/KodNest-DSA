public class SpacesCount {

        public static void main(String[] args) {
            String sent = "   This   is   a   line   with   extra   spaces   between   words. ";
            int count = 0;
            for(int i=0;i<sent.length();i++) {
                if(sent.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.print(count);
        }

}
