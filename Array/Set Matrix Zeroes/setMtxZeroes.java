public class setMtxZeroes{
       public static void main(String[] args){
          int[][] mtx = {
            {1,1,1,1},
            {1,1,0,1},
            {1,1,0,1},
            {1,1,1,1}
        };
        int rows = 4, columns = 4;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
               if(mtx[i][j] == 0){
                mtx[0][j] = 0;
                mtx[i][0] = 0;
               }
            }
        }

        for(int i = 0;  i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(mtx[i][0] == 0 || mtx[0][j] == 0){
                    mtx[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
               System.out.print(mtx[i][j]);
            }
            System.out.println();
        }
       }
}