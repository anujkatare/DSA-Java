public class demo {
    public static void main(String[] args) {
        int array[] = {5,3,2,6,10,40};
        int n = 6;
        int swapping = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = 0 ; j <= i - 1 ; j++ ){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    
                    swapping = 1 ;
                }
            }

            if(swapping == 0){
                break;
            }
        }
     
        for(int k = 0 ; k < 6 ; k++){
        System.out.println(array[k]);
    }
    }    
}
