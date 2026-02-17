public class demo {
    public static void main(String[] args) {
        int array[] = {1,0,8,6,0,4,3,9,0,8,0,7};
        int n = array.length;

        for(int j = 0; j<n-1;j++){
            for(int i = 0; i<n-1; i++){
                if(array[i] == 0 && array[i+1] != 0){
                 int temp = array[i];
                 array[i] = array[i+1];
                 array[i+1] = temp;
                }
            }   
        }


        for(int i = 0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
