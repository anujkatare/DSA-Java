public class demo {
    public static void main(String[] args) {
        int array [] = {1,2,4,7};
        int n = array.length;
        int target = 4;
        int mid = 0;
        int ans = 0;
        int low = 0; int high = n-1;

        while(low<=high){
            mid = (low+high)/2;

            if(target <= array[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
                System.out.println(ans);
    }
}
