import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1,3,5,4,8};
        int n = array.length;
        System.out.println(n);
        int distance = sc.nextInt();
        sc.close();

        for(int k = 0 ; k < distance ; k++){
            if(distance% n == 0){
               break;
            }

            int last = array[n-1];
           for(int i = 0 ; i < n ; i++){
            if(i == 0){
              array[n-1] = array[i];
            }else if(i == n-1){
             array[n-2] = last;
            }else{
                array[i-1] = array[i];
            }
        }
        }
        
        
    
        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i]+" ");
        }
    }
}
