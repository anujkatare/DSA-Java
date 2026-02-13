public class demo {
    public static void main(String[] args) {
        int array[] = {8,7,5,9,2};
        int n = 5;

        for(int i = 1; i <= n-1; i++){
            int j = i;
            while(j>0 && array[j-1]>array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
           }
        }
    
    
        for(int k = 0 ; k < n ; k++){
        System.out.println(array[k]);
        }
    }
}
