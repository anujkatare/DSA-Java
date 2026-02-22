public class demo {
    public static void main(String[] args) {
        int array[] = {2,6,5,8,11};
        int target = 14;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            int j = i+1;
            while(j<array.length){
                if(target > array[j]){
                    if(array[i]+array[j] == target){
                    System.out.println(i + " & " + j);
                    count++;
                    break;
                    }
                }else{
                    break;
                }
                 
                j++;
            }
        }
        if(count == 0){
            System.out.println("Number " + target + " as sum does not exist in the array.");
        }
    }
}
