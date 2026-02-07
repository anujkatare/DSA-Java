import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();  
        while(x != 0  && y != 0){
          if(x>y){
            x = x%y;
          }else{
            y = y%x;
          }
        }

        if(x == 0){
            System.out.println(y);
        }else{
            System.out.println(x);
        }
    }
}
