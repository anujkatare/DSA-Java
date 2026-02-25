public class demo {
    public static void main(String[] args) {
        int array[] = {2,3,5,4,1,0,0};
        int n = array.length;
        int pivotIndex = -1;
        int pivot = 0;
        int minNum = Integer.MAX_VALUE;

        for(int i = n-2; i >= 0; i--){
           if(array[i]<array[i+1]){
            pivotIndex = i;
            pivot = array[i];
            break;
           }
        }

    if(pivotIndex != -1) {    
        for(int i = n-1; i > pivotIndex; i--){
         if(array[i]>array[pivotIndex]){
            minNum = Math.min(minNum, array[i]);
              int temp = array[i];
              array[i] = array[pivotIndex];
              array[pivotIndex] = temp;

              break;
            }  
        }
    }

        int i = pivotIndex+1, j = n-1;
        while(i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++; j--;
        }

        for(int k = 0; k < n; k++){
            System.out.print(array[k]+" ");
        }
    }
}