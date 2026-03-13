public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,1,3,4,3,1};
        int n = array.length;
        int low = 0, high = n-1, mid = 0;

        if(n==1){
            System.out.println(array[0]);
        }

        if(array[0]>array[1]){
            System.out.println(array[0]);
        }
        if(array[n-1]>array[n-2]){
            System.out.println(array[n-1]);
        }

        while(low<=high){
            mid = (low+high)/2;

            if(array[mid]>array[mid-1]  && array[mid]>array[mid+1]){
                System.out.println(array[mid]);
            }
 
            if(array[mid] < array[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
    }
}
