public class demo {
    public static void markRow(int i,int[][] array){
        for(int x = 0; x < 4; x++){
           if(array[i][x] != 0){
              array[i][x] = -1;
           }
        }
    }
    public static void markColumn(int j,int[][] array){
        for(int x = 0; x < 4; x++){
           if(array[x][j] != 0){
              array[x][j] = -1;
           }
        }
    }
    public static void main(String[] args) {
        int[][] mtx = {
            {1,1,1,1},
            {1,0,0,1},
            {1,1,0,1},
            {1,1,1,1}
        };
        int rows = 4, columns = 4;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(mtx[i][j] == 0){
                    markRow(i,mtx);
                    markColumn(j,mtx);
                }
            }
        }
    
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(mtx[i][j] == -1){
                    mtx[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
               System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }
}
