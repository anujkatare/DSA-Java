public class demo {
    public  static int f(int x) {
        if(x <= 1){
            return x; 
        }
       
        int last = f((x-1));
        int secondLast = f((x-2));

        return last + secondLast;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(f(n));
    }
}
