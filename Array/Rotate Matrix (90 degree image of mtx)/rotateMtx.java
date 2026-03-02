public class rotateMtx {
    public static void main(String[] args) {
        int mtx[][] = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                      };
        int n = 4;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                    int temp = mtx[i][j];   
                    mtx[i][j] = mtx[j][i];
                    mtx[j][i] = temp;
            }
        }
 
        for(int i = 0; i < n; i++){
            int k = 0, l = n-1;
            for(int j = 0; j < n; j++){
                if(k<l){
                    int temp = mtx[i][k];
                    mtx[i][k] = mtx[i][l];
                    mtx[i][l] = temp;
                    k++; l--;
                }
            }
        }
    
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
