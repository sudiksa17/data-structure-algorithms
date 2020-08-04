/**Given a boolean matrix mat[M][N] of size M X N,
 *  modify it such that if a matrix cell mat[i][j] 
 * is 1 (or true) then make all the cells of ith row and jth column as 1. */
public class BooleanMatrix{
    public static void main(String[] args) {
        int[][] matrix = {{0,1},{0,0},{0,0}};

        int[][] result = Modification(matrix, 3, 2);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[][] Modification(int[][] matrix,  int n, int m){
        int ithIndex = -1;
        int jthIndex = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j]==1){
                    ithIndex = i;
                    jthIndex = j;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            matrix[i][jthIndex] = 1;
        }
        for(int j=0;j<m;j++){
            matrix[ithIndex][j] = 1;
        }
        return matrix;
    }
}