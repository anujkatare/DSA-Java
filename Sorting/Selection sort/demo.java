public class demo {
    public static void main(String[] args) {
        int array[] = {5,3,2,6,10,40};

        for(int i = 0 ; i < 6 ; i++){
            for(int j = i+1 ; j < 6 ; j++ ){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
     
        for(int k = 0 ; k < 6 ; k++){
        System.out.println(array[k]);
    }
    }    
}
