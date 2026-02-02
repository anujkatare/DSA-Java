public class demo {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            //space
            for(int j = 1; j < i+1; j++){
                System.out.print(' ');
            }
            //stars
            for(int j = 0; j < 5-i; j++){
                System.out.print('*'+" ");
            }
            //space
            for(int j = 1; j < i+1; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
