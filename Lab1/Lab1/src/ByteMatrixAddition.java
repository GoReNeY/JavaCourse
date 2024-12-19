import java.util.Arrays;

public class ByteMatrixAddition {
    public static void addMatrices(byte[][] matrix1, byte[][] matrix2) {

        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("Both matrices must be non-null.");
        }

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Both matrices must have the same dimensions.");
        }

        byte[][] addedMatrix = new byte[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                // Handle potential overflow with a cast to int, then cast back to byte
                int sum = matrix1[i][j] + matrix2[i][j];
                if (sum > Byte.MAX_VALUE || sum < Byte.MIN_VALUE) {
                    throw new ArithmeticException("Sum exceeds byte range at position (" + i + ", " + j + ").");
                }
                addedMatrix[i][j] = (byte) sum;
            }
        }

        System.out.printf("Result matrix is %s%n", Arrays.deepToString(addedMatrix));


        int totalSum = 0;

        for (byte[] row : addedMatrix) {
            byte maxElement = Byte.MIN_VALUE;
            for (byte value : row) {
                if (value > maxElement) {
                    maxElement = value;
                }
            }
            totalSum += maxElement;
        }
        System.out.printf("Sum of all rows max elements is %d%n", totalSum);
    }
}
