public class demo {
    public static void main(String[] args) {
        int array[] = {4,5,6,7,8,1,2};
        int n =  array.length;
        int low = 0, high = n-1, mid = 0, ans = Integer.MAX_VALUE;
    
        while(low<=high){
            mid =  (low+high)/2;

            if(array[low]<=array[high]){
                ans = Math.min(ans, array[low]);
                System.out.println(ans);
                break;
            }

            if(array[low] <= array[mid]){
                ans = Math.min(ans, array[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans, array[mid]);
                high = mid-1;
            }
        }
    }
}
