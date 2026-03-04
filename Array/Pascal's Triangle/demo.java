public class demo {
    public static long nCr(int n, int r){
         int k = 1, l = 1, m = 1;
         for(int i = 1; i <= n; i++){
            k *= i;
         }
         for(int i = 1; i <= r; i++){
            l *= i;
         }
         for(int i = 1; i <= (n-r); i++){
            m *= i;
         }

         long ans = (k)/(l*m);
         return ans;
    }
    public static void main(String[] args) {
       System.out.println( nCr(3, 1) );
    }
}
