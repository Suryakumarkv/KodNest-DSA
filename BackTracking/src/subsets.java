public class subsets {

    public static void findSubSets(String str, String ans, int i) {

        //Base Case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("Null");
            } else
            System.out.println(ans);
            return;
        }

        //Recursion
        //yes-choice
        findSubSets(str,ans+str.charAt(i),i+1);

        //no-Subsets
        findSubSets(str, ans, i+1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findSubSets(str,ans,0);
    }
}
