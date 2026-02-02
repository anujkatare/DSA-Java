public class demo {
    public static void main(String[] arg){
          for(int i= 0 ; i < 6 ; i++){
            char ch= 'A';
            ch = (char)(ch + i);
            for(int j= 0 ; j <= i; j++){
               System.out.print(ch);
            }
            System.out.println();
            
          }
    }
}
