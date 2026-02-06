import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int a = Math.max(x, y);
        int b = Math.min(x, y);
        int ans = 0;

        for(int i = 1; i <= a; i++){
            if(a%i == 0 && b%i == 0){
                ans = i;
                break;
            }
        }
        System.out.println("HCF IS : " + ans);
    }
}
