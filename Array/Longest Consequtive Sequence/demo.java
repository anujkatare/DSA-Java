import java.util.*;
public class demo {
    public static void main(String[] args) {
        int array[] ={102,4,100,1,101,3,2,1,1};
        Set<Integer> ans = new HashSet<>();
        int count = 1;
        int longest = 0;

        for(int i = 0; i < array.length; i++){
            ans.add(array[i]);
        }
        
        for(int items : ans){
            if(!ans.contains(items-1)){
                int m = items+1;

                while(ans.contains(m)){
                    count++;
                    m++;
                }
                
                longest = Math.max(longest, count);
                count = 1;
            }
        }
        System.out.println(longest);
    }
}
