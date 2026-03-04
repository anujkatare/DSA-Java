public class demo {
    public static void byHash(int[] array) {
        int hashArray[] = new int[4];

       for(int i = 0; i < array.length; i++){
            hashArray[array[i]] += 1;
       }
       for(int i = 1; i < hashArray.length; i++){
          if(hashArray[i]>array.length/3){
            System.out.println(i);
          }
       }
    }
    
    public static void optimal(int[] array) {
        int count = 1;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                count = 1;
            }
            if(array[i] == array[i+1]){
                count++;
            }
            if(count>array.length/3){
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
       int array[] = {1,1,1,3,3,2,2,2};
       //byHash(array);
       optimal(array);
    }
}
