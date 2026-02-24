public class demo {
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = array.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<n ; i++){
            sum = 0;
            for(int j = i+1; j<n; j++){
                sum += array[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
    
        System.out.println(maxSum);
    }
}
