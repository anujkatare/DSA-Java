public class demo {
    public static void main(String[] args){
        for(int i = 0 ; i < 4 ; i++){
            if(i == 0 || i == 3){
                for(int j = 0 ; j< 5 ; j++){
                System.out.print("*");   
                }
            }else{
                for(int j = 0 ; j< 1 ; j++){
                System.out.print("*");   
                }
                for(int j = 0 ; j< 3 ; j++){
                System.out.print(" ");   
                }
                for(int j = 0 ; j< 1 ; j++){
                System.out.print("*");   
                }
            }
            System.out.println(" ");
        }
    }
}
