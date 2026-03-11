public class demo {
     public static void LowerBound(int arr[], int target, int low, int high) {
        int mid = 0;
        int ans = -1;
        
        while (low<=high) {
            mid = (low+high)/2;
            if(target<=arr[mid]){
            ans = mid;
            high = mid-1;
            }else{
            low = mid+1;
            }
        }
        System.out.println(ans);
    }

    public static void UpperBound(int arr[], int target, int low, int high) {
        int mid = 0;
        int ans = -1;
        
        while (low<=high) {
            mid = (low+high)/2;
            if(target<arr[mid]){
            ans = mid-1;
            high = mid-1;
            }else{
            low = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,8,8,8,11,13};
        int n = array.length;
        int target = 8;

        LowerBound(array,target,0,n-1);
        UpperBound(array,target,0,n-1);
    }
}
