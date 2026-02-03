public class demo {
    public static void main(){
        for(int i = 0 ; i < 5 ; i++){
            //star
            for(int j = 0 ; j < 5-i ; j++){
             System.out.print("*");
            }
            //space
            for(int j = 0 ; j < 2*i ; j++){
             System.out.print(" ");
            }
            //star
            for(int j = 0 ; j < 5-i ; j++){
             System.out.print("*");
            }

            System.out.println();
        }
        for(int i = 0 ; i < 5 ; i++){
            //star
            for(int j = 0 ; j < i+1 ; j++){
             System.out.print("*");
            }
            //space
            for(int j = 8 ; j > 2*i ; j--){
             System.out.print(" ");
            }
            //star
            for(int j = 0 ; j < i+1 ; j++){
             System.out.print("*");
            }

            System.out.println();
        }
    }
}
