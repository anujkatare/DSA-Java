import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;
            while(n != 0){
                System.out.println(n%10);
                n/=10;
                count++;
            }
            System.out.println("Digits: " + count);
    }
}
