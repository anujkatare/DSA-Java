public class demo {
    public static void main(String[] args){
        int array[] = {0,1,1,0,1,2,1,2,0,0,0};
        int n = array.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(array[mid] == 0){
              int temp = array[low];
              array[low] = array[mid];
              array[mid] = temp;
              low++;
              mid++;
            }else if(array[mid] == 1){
              mid++;
            }else if(array[mid] == 2){
              int temp = array[high];
              array[high] = array[mid];
              array[mid] = temp;
              high--;
            }
        }
        for(int i = 0;  i < n ; i++){
            System.out.print(array[i]);
        }
    }
}
