public class Diagonal {

    public static int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    public static int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};

    public static void main(String[] args) {
        System.out.println(resultOfDiagonalSumm(matrix));
        System.out.println(resultOfDiagonalSumm(mat));
    }

    public static int resultOfDiagonalSumm ( int[][] mat) {
        int sum=0;
        for (int i = 0, j=(mat.length-1); i < mat.length; i++, j--) {
            sum+=mat[i][i];
            if (j!=i) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
