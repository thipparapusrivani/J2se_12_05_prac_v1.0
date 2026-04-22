public class CountOfCharInStr {
    public static void main(String[] args) {

      String word = "Helloworld";
      int[] freq = new int[256];

        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            freq[ch]++;
        }

        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i+"->"+freq[i]);
            }
        }

    }
}
