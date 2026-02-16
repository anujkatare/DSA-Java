public class demo{
    public static void main(String[] args) {
        double array[] = {5,4,3,10,4};
        Double max = Double.NEGATIVE_INFINITY;
       

        for(int i = 0; i < 5; i++){
            if(array[i] > max){
                 max = array[i];
            }
        }

        System.out.println(max);
    }
}