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
        
        //most repeated element
        int count = 0;
        for(int j = 0 ; j < 6 ; j++){
            for(int k = 0 ; k < 6 ; k++){
               if(count < hashArray[k]){
                count = hashArray[k];
            }
            }
        
            if(count == hashArray[j]){
              System.out.println("Most repeated element is  = " + j );
            }
        }
    }
}
