public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,3,1,1,1};
        int k = 6;
        int i = 0;
        int sum = 0;
        int length = 0;

        for(int j = 0; j < array.length; j++){
           sum += array[j];

           while(sum>k){
            sum -= array[i];
            i++;
           }

           if(sum == k){
            length = Math.max(length, j-i+1);
           }
        }
        System.out.println(length);
    }
}
