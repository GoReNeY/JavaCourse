# ByteMatrixAddition

This project provides a simple implementation in Java for performing addition of two matrices of type `byte`, with additional features for printing the resulting matrix and calculating the sum of the largest elements in each row of the resulting matrix.

## How to Use

### Code Example
Below is an example demonstrating the usage of the matrix addition functionality:

```java
public class Main {
    public static void main(String[] args) {
        byte[][] matrix1 = new byte[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        byte[][] matrix2 = new byte[][]{{9, 7, 5}, {3, 2, 3}, {13, 22, 1}};

        ByteMatrixAddition.addMatrices(matrix1, matrix2);
    }
}
```
Output
Given the matrices:

matrix1:

```
1 2 3
4 5 6
7 8 9
```
matrix2:

```
9 7 5
3 2 3
13 22 1
```
The program will produce the following output:


```
Result matrix is [[10, 9, 8], [7, 7, 9], [20, 30, 10]]
Sum of all rows max elements is 46
```