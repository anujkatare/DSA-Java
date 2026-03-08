public class demo {
    public static void main(String[] args) {
        int array[] = {2,3,-2,4};
        int max = array[0];
        int min = array[0];
        int ans = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(array[i],max*array[i]);
            min = Math.min(array[i],min*array[i]);

            ans = Math.max(ans,max);
        }
        System.out.println(ans);
    }
}
