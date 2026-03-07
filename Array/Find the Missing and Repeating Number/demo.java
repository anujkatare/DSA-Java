public class demo {
    public static void main(String[] args) {
        int array[] = {4,3,6,2,1,1};
        int lim = 6;
        int n = array.length;
        int count = 0;
// this can be done by hashing
        for(int i = 1; i < lim; i++){
              count = 0;
            for(int j = 0; j < n; j++){
            if(i == array[j]){
              count++;
            }
        }
            if(count>1){
                System.out.println(i+" is repeated element");
                }
            if(count == 0){
                System.out.println(i+" is not in array");
            }
        }
    }
}
