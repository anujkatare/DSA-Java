public class demo {
    public static void main(String[] args) {
        int array[] = {3,4,5,1,2};
        int n = array.length;
        int low = 0, high = n-1,  mid = 0, min = Integer.MAX_VALUE;

        while(low<=high){
            mid = (low+high)/2;

            if(array[low]<=array[high]){
                System.out.println(low);
                break;
            }

            if(array[low]<=array[mid]){
              min = Math.min(array[low], min);
              low = mid+1;
            }else{
              min = Math.min(array[mid], min);
              high = mid-1;
            }
        }
    }
}
