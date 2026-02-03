public class demo {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            //space
            for(int j = 0; j < 4-i; j++){
                System.out.print(' ');
            }
            //char
            char ch = 'A';
            int breakPoint = (i+1)/2;
            for(int j = 0; j < i+1; j++){
                System.out.print(ch +" ");
                if(j < breakPoint){
                ch++;
                }else{
                ch--;
                } 
            }
            //space
            for(int j = 0; j < 4-i; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
