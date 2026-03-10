public class demo {
    public static void Floor(int array[], int target) {
        int n = array.length;
        int low = 0; int high = n-1;
        int floor = 0, mid = 0;

        while(low<=high){
            mid = (low+high)/2;
            if(target>=array[mid]){
                floor = array[mid];
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println("Floor is : " + floor);
    }

    public static void Ceil(int array[], int target) {
        int n = array.length;
        int low = 0; int high = n-1;
        int ceil = 0, mid = 0;
         while(low<=high){
            mid = (low+high)/2;
            if(target<=array[mid]){
                ceil = array[mid];
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println("Ceil is : " + ceil);
    }
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int target = 25;
        
        Floor(array, target);
        Ceil(array, target);
    }
}
