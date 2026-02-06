import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;

        for(int i = 1 ; i <= x ; i++){
            if(x%i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println(x+" is a prime number");
        }else{
            System.out.println(x+" is not a prime number");
        }
    }
}
