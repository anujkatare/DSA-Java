public class demo {
    public static void main(String[] args) {
       int array[] = {1,1,2,3,3,4,4};
       int hashArray[] = new int[5];
       int n = array.length;
       int min = Integer.MAX_VALUE;

       for(int i = 0; i < n; i++){
        hashArray[array[i]] += 1;
       }

       for(int i = 1 ;  i < 5; i++){
        min = Math.min(min, hashArray[i]);
       }
       
       System.out.print(hashArray[min]);
    }
}
