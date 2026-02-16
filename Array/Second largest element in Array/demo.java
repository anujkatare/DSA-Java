public class demo {
    public static void main(String[] args) {
        double array[] ={9,3,1,6,7,2};
        double max = Double.NEGATIVE_INFINITY;
        double max2 = Double.NEGATIVE_INFINITY;

        for(int i = 0 ; i < 6; i++){
           if(max < array[i]){
            max = array[i];
           }
        }

        for(int j = 0; j < 6; j++){
            if(max != array[j] && max2 < array[j]){
              max2 = array[j];
            }
        } 

        System.out.println(max2);
    }
}
