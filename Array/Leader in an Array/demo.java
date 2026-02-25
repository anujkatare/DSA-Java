public class demo {
    public static void main(String[] args) {
        int array[] = {10,22,12,3,0,6};
        int ans[] = new int[3];
        int n = array.length;
        int count = 0;
        int k = 0;

        for(int i = 0; i <  n ; i++){ 
           for(int j = i+1; j < n; j++){
            if(array[i]<array[j]){
                count++;
                break;
            }
           }

           if(count == 0){
            ans[k] = array[i];
            k++;
           }
           count = 0;
        }

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
