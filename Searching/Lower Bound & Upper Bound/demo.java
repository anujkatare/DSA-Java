public class demo {
    public static void LowerBound(int arr[], int target, int low, int high) {
        int mid = 0;
        int ans = 0;
        
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
        int ans = 0;
        
        while (low<=high) {
            mid = (low+high)/2;
            if(target<arr[mid]){
            ans = mid;
            high = mid-1;
            }else{
            low = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int array[] = {1,2,2,3,3,5,6,6,7,8};
        int n = array.length;
        int target =  2;

        LowerBound(array,target,0,n-1);
        UpperBound(array,target,0,n-1);
    }
}
