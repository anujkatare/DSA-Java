import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int restoredX = x;
        int reverseNum = 0;
        while(x != 0){
            int lastDig = x % 10;
            reverseNum = reverseNum * 10 + lastDig;
            x /= 10;
        }

        if(restoredX == reverseNum){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

