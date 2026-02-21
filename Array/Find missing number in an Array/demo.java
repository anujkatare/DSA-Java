public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,4,5};
        int n = 5;
        
        for(int i = 0; i < n-1; i++){
            if(array[i] != i+1){
                System.out.println("Missing number is " + (i+1));
                break;
            }
        }
    }
}
