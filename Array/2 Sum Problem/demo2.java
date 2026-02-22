import java.util.*;
public class demo2 {
    public static void main(String[] args) {
        int array[] = {2,6,5,8,11};
        Arrays.sort(array);
        int target = 19;
        int count = 0;
        int i = 0;
        int j = array.length-1;
        int sum = 0;

        while(i < j){
            sum = array[i]+array[j];
            if(sum == target){
                System.out.println(i+" and "+j);
                count++;
                break;
            }
            if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        if(count == 0){
            System.out.println("Number " + target + " as sum does not exist in the array.");
        }
    }
}
