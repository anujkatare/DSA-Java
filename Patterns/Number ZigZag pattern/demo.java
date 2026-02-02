public class demo{
    public static void main(String[] args){
         for(int i = 1; i <= 4; i++ ){
            //number
            for(int j = 1; j < i+1; j++){
              System.out.print(j);
            }
            //space
            for(int j = 1; j < 5-i; j++){
                System.out.print("  ");
            }
            //number
            for(int j = i; j>=1 ; j--){
               System.out.print(j);
            }
            System.out.println();
         }
    }
}
