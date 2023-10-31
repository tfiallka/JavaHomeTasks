import java.util.concurrent.Callable;

public class RowMultiplicationSum implements Callable<Integer> {
    private final int[][] matrix;
    private int sumOfRowMultiplication;
    private int item;

    public RowMultiplicationSum(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer call() {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int[] ints : matrix) {
                item *= ints[i];
            }
            sumOfRowMultiplication += item;
            item = 1;
        }
        System.out.println(sumOfRowMultiplication);
        return sumOfRowMultiplication;
    }
}
