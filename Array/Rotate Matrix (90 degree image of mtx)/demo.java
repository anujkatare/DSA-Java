public class demo {
    public static void main(String[] args) {
        int mtx[][] = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                      };
        int ans[][] = new int[4][4];
        int n = 4;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                  ans[j][(n-1)-i] = mtx[i][j];
            }
        }
    
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
