public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,3,9};
        int count = 0;
        int n = array.length;

        for(int i = 0; i < n-1; i++){
            if(array[i] < array[i+1]){
                count++;
            }
        }

        if(count == n-1){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is unsorted");
        }
    }
}
