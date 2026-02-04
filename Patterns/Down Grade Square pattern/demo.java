public class demo {
    public static void main(String[] args) {
        for(int i = 0 ; i < 7 ; i++){
            for(int j = 0 ; j < 7 ; j++){
               int top = i;
               int left = j;
               int bottom = 6 -i;
               int right = 6 -j;

               int num = Math.min(Math.min(left,right),Math.min(bottom,top));

               System.out.print(4 - num);
            }
            System.out.println();
        }
    }
}
