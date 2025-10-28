public class frequency {
    public static void main(String[] args) {
        String s = "RAJA RAM MOHAN ROY";

        s.replaceAll("\\s+", "");
        char word[] = s.toCharArray();
        int Mostfreq = 0;
        for(int i = 0; i < word.length; i++){
            int freq = 0;
            for(int j = i; j < word.length; j++){
                if(word[i] == word[j]){
                    freq++;
                }
            }
            if(freq > Mostfreq){
                Mostfreq = freq;
            }
        }
        System.out.println(Mostfreq);
    }
}
