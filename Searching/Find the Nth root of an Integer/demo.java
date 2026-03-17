public class demo {
    public static int mulmid(int n , int mid) {
        int ans = 1;
        while(n>0){
            if(n%2 == 1){
                ans *= mid;
                n = n-1;
            }else{
                mid *= mid;
                n = n/2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3, num = 27, ans = -1;
        int  low = 1, high = num, mid = 0, mulmidoutput = 1;

        while(low<=high){
            mid = (low+high)/2;

            mulmidoutput = mulmid(n, mid);

            if(mulmidoutput == num){
                ans = mid;
                break;
            }else if(mulmidoutput < num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        System.out.println(ans);
    }
}
