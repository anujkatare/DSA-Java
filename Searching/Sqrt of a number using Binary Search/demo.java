public class demo {
    public static void main(String[] args) {
        int n = 38;
        int ans = 0;
        int low = 1, high = n, mid = (low+high)/2;

        while(low<=high){
            mid = (low+high)/2;

            if(mid*mid > n){
                high = mid-1;
            }else{
                ans = mid;
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}
