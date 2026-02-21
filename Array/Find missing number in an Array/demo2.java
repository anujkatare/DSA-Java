public class demo2 {
    public static void main(String[] args) {
        int array[] = {1,2,4,5};
        int n = 5;
        int sum = (n*(n+1))/2;
        int sum2 = 0;

        for(int i = 0; i < array.length; i++){
            sum2 = sum2 + array[i];
        }

        int ans = sum - sum2;

        System.out.println("Missing num is " + ans);
    }
}
