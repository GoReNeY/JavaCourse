

public class Main {
    public static void main(String[] args) {

        byte[][] matrix1 = new byte[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        byte[][] matrix2 = new byte[][]{{9,7,5}, {3,2,3}, {13,22,1}};

        ByteMatrixAddition.addMatrices(matrix1, matrix2);
    }
}