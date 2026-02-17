import java.util.*;
public class demo2 {
    public static void reverse(int array[],int x, int y) {
        while(x<=y){
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
            x++;
            y--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {3,4,2,1,5,6};
        int n = array.length;
        int distance = sc.nextInt();
        sc.close();

        reverse(array,0,distance-1);
        reverse(array,distance,n-1);
        reverse(array,0,n-1);

        for(int i = 0; i< n; i++){
           System.out.print(array[i]+" ");
        }
    }
}
