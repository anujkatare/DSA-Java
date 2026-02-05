import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int num = 0;
        int y = x;

        while(x != 0){
        int lastDig = x%10; 
        num = num + lastDig*lastDig*lastDig;
        x /= 10; 
        }
 
        System.out.println(num);

        if(y == num){
           System.out.println(y + " is a Armstrong number");
        }else{
           System.out.println(y + " is not a Armstrong number");
        }
    }
}
