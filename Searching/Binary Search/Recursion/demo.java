public class demo {
    public static int binarySearch(int arr[], int n, int target, int low, int high) {
           if(low>high){
            return -1;
           }

           int mid = (low+high)/2;

           if(target == arr[mid]){
            return mid;
           }

           if(target<arr[mid]){
            return binarySearch(arr, n, target, low, mid-1);
           }else{
            return binarySearch(arr, n, target, mid+1, high);
           }
    }
    public static void main(String[] args) {
        int array[] = {1,4,5,6,8,9};
        int n = array.length;
        
        System.out.println(6 + " found at : " + binarySearch(array, n, 6, 0, n-1));
    }
}
