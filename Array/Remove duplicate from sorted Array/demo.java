public class demo {
    public static void main(String[] args) {
        int array[] = {1,1,2,4,5,5,6};
        int n = array.length;

        int j = 0;  // write pointer

        for(int i = 1; i < n; i++){
            if(array[i] != array[j]){
                j++;
                array[j] = array[i];
            }
        }

        // Print only unique elements
        for(int i = 0; i <= j; i++){
            System.out.print(array[i] + " ");
        }
    }
}
