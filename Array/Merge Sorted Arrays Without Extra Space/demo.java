public class demo {
        public static void main(String[] args) {
            int arr1[] = {1,3,5,7}; int arr2[] = {0,2,6,8,9};
            int m = arr1.length, n = arr2.length;
            int ans[] = new int[9];
            int i = 0 , j = 0,l = 0;
            
            while(i<m && j<n){
                if(arr1[i] <= arr2[j]){
                    ans[l] = arr1[i];
                    i++;
                    l++;
                }else{
                    ans[l] = arr2[j];
                    j++;
                    l++;
                }
            }
            
            while(i<m){
                ans[l++] = arr1[i++];
            }
            while(j<n){
                ans[l++] = arr2[j++];
            }

            for(int k = 0; k < ans.length; k++){
                System.out.print(ans[k]+" ");
            }
        }
}
