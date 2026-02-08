import java.util.*;
public class demo {
    public int f(int x) {
        if(x == 0){
          return 1;
        }
        return x * f(x-1);
    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       
        System.out.println( f(n) );
    }
}
