public class demo {
    public static void main(String[] args) {
        int array[] = {2,4,1,6,4,8,5,3,2};
        int n = array.length;
        int count = 0;
        int target = 8;

        for(int i = 0; i < n; i++){
            if(array[i] == target){
                System.out.println(target + " is found at index: " + i);
            }
            if(array[i] != target){
                count++;
            }
            if(count == n){
                System.out.println("Please enter a valid number");
            }
        }
    }
}
