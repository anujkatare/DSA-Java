public class demo {
    public static void main(String[] args) {
        int array[] = {2,2,3,3,1,2,1,1,1,1};
        int hashArray[] = new int[4];
        int n = hashArray.length;
        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
           hashArray[array[i]] += 1;
        }

        for(int i = 0; i < n; i++){
            max = Math.max(max, hashArray[i]);
        }

        for(int i = 1; i < n; i++){
            if(hashArray[i] > hashArray[index]){
                index = i;
            }
        }
    
        System.out.println(index);
    }
}
