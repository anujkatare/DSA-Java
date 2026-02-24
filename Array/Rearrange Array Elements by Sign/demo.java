public class demo {
    public static void main(String[] args) {
        int array[] = {3,1,-2,-5,2,-4};
        int n = array.length;
        int positiveArray[] = new int[n/2];
        int negativeArray[] = new int[n/2];
        int k = 0, l = 0;        


        for(int i = 0; i < n; i++){
            if(array[i] < 0){
              negativeArray[k] = array[i];
              k++;
            }else if(array[i] > 0){
              positiveArray[l] = array[i];
              l++;
            }
        }
        
        k=0; l=0;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                array[i] = positiveArray[k];
                k++;
            }else if(i%2 != 0){
                array[i] = negativeArray[l];
                l++;
            }
        }
    
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
