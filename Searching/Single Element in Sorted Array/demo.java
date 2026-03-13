public class demo {
    public static void main(String[] args) {
        int array[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n= array.length;

        int low = 0, high = n-1, mid = (high/2);
        
        if(array[low] != array[low+1]){
            System.out.println(array[low]);
        }else{
            low++;
        }
        if(array[high] != array[high-1]){
            System.out.println(array[high]);
        }else{
            high--;
        }
        
        while(low<=high){
           mid = (low+high)/2;
            
           if(array[mid] != array[mid-1] && array[mid] != array[mid+1]){
            System.out.println(array[mid]);
           }

           if(((mid)%2 == 1 && array[mid-1] == array[mid]) || (mid%2 == 0 &&  array[mid] == array[mid+1])){
              low = mid+1;
           }else{
              high = mid-1;
           }
        }
    }
}
