public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,5,6,7,88,99};
        int n = array.length;
        int mid = n/2;
        int target = 88;

       int low = 0, high = n-1;

       while(low<=high){
        mid = (low+high)/2;

        if(target<array[mid]){
            high = mid;
        }else if (target>array[mid]){
            low = mid+1;

        }else{
            System.out.println(target + " found at : " + mid);
            break;
        }
       }
        
    }
}
