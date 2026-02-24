public class kadanesAlgo {
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = array.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            sum += array[i];
            sum = Math.max(array[i], sum);
            maxSum =Math.max(maxSum, sum);
        }
    
        System.out.println(maxSum);
    } 
}
