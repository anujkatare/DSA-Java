public class demo {
    public static void main(String[] args) {
        int array[] = {7,8,9,1,1,2,3,4,5,6};
        int n = array.length;
        int target = 1;
        int low = 0, high = n-1, mid = 0;

        while(low<=high){
            mid = (low+high)/2;

            if(target == array[mid]){
               System.out.println("true");
            }
            if(array[low] == array[mid] && array[mid] == array[high]){
                low++;
                high--;
                continue;
            }
            
            if(array[low]<=array[mid]){
                if(array[low]<=target && target<=array[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(array[mid]<=target && target<=array[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
    }
}
