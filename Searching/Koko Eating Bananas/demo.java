public class demo {
    public static void main(String[] args) {
        int  array[] = {3,6,7,11};
        int n = array.length, h =  8, ans = 0;
        long sum = 0;
        int low = 0, high = array[n-1], mid = 0;

        while(low<=high){
            mid = low+ (high-low)/2;
            sum = 0;
            for(int i = 0; i<n; i++){
                sum += (array[i] + mid - 1) / mid;
            }

            if(sum <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
    System.out.println(ans);

    }
}
