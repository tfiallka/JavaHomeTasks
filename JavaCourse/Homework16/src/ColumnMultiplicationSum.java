import java.util.concurrent.Callable;

public class ColumnMultiplicationSum implements Callable<Integer> {
    private final int[][] matrix;
    private int sumOfColumnMultiplication;
    private int item;

    public ColumnMultiplicationSum(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer call() {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                item *= ints[j];
            }
            sumOfColumnMultiplication += item;
            item = 1;
        }
        System.out.println(sumOfColumnMultiplication);
        return sumOfColumnMultiplication;
    }
}
