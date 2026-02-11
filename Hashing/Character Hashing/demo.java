import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String script = "anujkatare";
        script.toLowerCase();
        int count = 0;
        char input = scanner.next().charAt(0);
        
        for(int i = 0 ; i < 10 ; i++){
            if(script.charAt(i) == input){
                count++;
            }
        }
        System.out.println(count);
    }
}
