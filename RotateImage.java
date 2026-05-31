public class RotateImage {
    public static void rotate (int [][] mat){
        int size=mat.length;
        //transpose
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                mat[row][col] ^= mat[col][row];
                mat[col][row] ^= mat[row][col];
                mat[row][col] ^= mat[col][row];
            }
        }
        //reverse
        for(int row=0;row<size;row++){
            int left=0,right=size-1;
            while(left<right){
                mat[row][left]^=mat[row][right];
                mat[row][right]^=mat[row][left];
                mat[row][left]^=mat[row][right];
                left++;right--;
            }

        }
    }
    public static void main(String[] args){
    int[][] alpha = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    rotate(alpha);

    for(int[] row : alpha){
        for(int num : row){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
    }
    

