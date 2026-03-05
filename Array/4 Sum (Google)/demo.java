import java.util.*;
public class demo {
    public static void main(String[] args) {
        int array[] = {1,1,1,0,-1,-1,0,-2,2};
        Arrays.sort(array);
        for(int i = 0; i<array.length-1; i++){
            if(i>0 && array[i] == array[i-1]) continue;
            for(int j = i+1; j<array.length-2; j++){
                if(j>i+1 && array[j] == array[j-1]) continue;
                int left = j+1, right = array.length-1;
                while(left<right){
                    int sum = array[i]+array[j]+array[left]+array[right];

                    if(sum == 0){
                        System.out.println(array[i]+","+array[j]+","+array[left]+","+array[right]);
                        left++; right--;

                        while(left<right && array[left] == array[left+1]){left++;};
                        while(left<right && array[right] == array[right-1]){right--;};
                    }else if(sum<0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
    }
}
