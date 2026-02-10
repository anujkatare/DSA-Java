public class demo {
    public void f(int f, int r, char[] word) {
        
        if(f >= r){
            return;
        }
            char temp = word[f];
            word[f] = word[r];
            word[r] = temp;

        
        f(f+1, r-1, word);
        
    }
    public static void main(String[] args) {
        String word = "KAYAK";
        String tempWord = word;

        char[] arr = word.toCharArray();
        demo d = new demo();
        d.f(0, 4, arr);
        word = new String(arr);
         System.out.println("tempword is = "+tempWord);
         System.out.println("word is =" + word);
          if(tempWord.equals(word)){
            System.out.println(tempWord + " is palindrome");
          }else{
            System.out.println(tempWord + " is not palindrome");
          }
    }
}
