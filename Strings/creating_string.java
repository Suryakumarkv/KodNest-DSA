public class creating_string {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = new String("Mango");
        char[] ch = {'G','u','a','v','a'};
        String s3 = new String(ch);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(ch);
        System.out.println(s3);
    }
}
