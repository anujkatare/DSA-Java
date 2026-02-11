import java.util.Arrays;

import Hashing.Introduction.demo;

public class demo {
    public int f(int l, int r, int array[]) {
        if(l >= r){
            return 0 ;
        }

        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;

         return f(l+1, r-1, array);
        
    }
    public static void main(String[] args) {
       int[] array = {10,30,20,40,55};
       demo d = new demo();
       d.f(0, 4, array);
       System.out.println(Arrays.toString(array));
     }
}
