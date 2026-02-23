public class MooresVotingAlgo {
    public static void main(String[] args) {
        int array[] = {4,5,4,4,3,2,4};
        int n = array.length;
        int element = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
           if(count == 0){
              element = array[i];
           }

           if(array[i] == element){
            count++;
           }else{
            count--;
           }
        }
        
        System.out.println(element);
    }
}
