public class demo {
    public static void brutte(int arr[], int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int xor = 0;
                for(int k = i; k < j; k++){
                    xor = xor^arr[k];
                    if(xor == x){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void optimal(int arr[], int x) {
        
    }
    public static void main(String[] args) {
        int array[] = {4,2,2,6,4};
        int k = 6;

        brutte(array, k);
    }
}
