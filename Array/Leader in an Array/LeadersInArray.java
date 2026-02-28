public class LeadersInArray {
    public static void main(String[] args) {
        int array[] = {10,22,12,3,0,6};
        int max = Integer.MIN_VALUE;
        int n = array.length;
        int k = 0;
        int ans[] = new int[3];

        for(int i = n-1; i >= 0; i--){
            if(max < array[i]){
                max = Math.max(max, array[i]);
                ans[k] = array[i];
                k++;
            }
        }
    
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
