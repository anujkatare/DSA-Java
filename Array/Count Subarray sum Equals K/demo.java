import java.util.*;
public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,3,-3,1,1,1,4,2,-3};
        int n = array.length, k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int currentSum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            currentSum += array[i];

            if(map.containsKey(currentSum-k)){
                count += map.get(currentSum-k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
        }

        System.out.println("Result: " + (count));
    }
}
