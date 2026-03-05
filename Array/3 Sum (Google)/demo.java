import java.util.*;
public class demo {
    public static void main(String[] args) {
        int array[] = {-1,0,1,2,-1,-4};
        Arrays.sort(array);

        for(int i = 0; i < array.length-2; i++){
            if (i > 0 && array[i] == array[i - 1]) continue;
            int left = i+1, right = array.length-1;
            while(left<right){
                int sum = array[i]+array[left]+array[right];

                if(sum == 0){
                    System.out.println(array[i]+","+array[left]+","+array[right]);
                    left++;
                    right--;

                    while(left<right && array[left] == array[left-1]){left++;};
                    while(left<right && array[right] == array[right+1]){right--;};
                }else if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }
               
            }
        }
    }
}
