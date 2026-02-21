public class demo {
    public static void main(String[] args) {
        int array[] = {1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,0};
        int count = 0;
        int max = 0;
    
        for(int i = 0; i < array.length; i++){
           if(array[i] == 1){
              count++;
              max = Math.max(max, count);
           }else{
            count = 0;
           }
        }

        System.out.println(max);
    }
}
