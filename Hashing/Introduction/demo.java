package Hashing.Introduction;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {1,3,2,4,1,5};
        int hashArray[] = new int[6]; 
        for(int i = 0 ; i < 6 ; i++){
           hashArray[array[i]] += 1;
        }
        
        int n = scanner.nextInt();

        System.out.println(hashArray[n]);
    }
}
