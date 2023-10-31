
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.Arrays.stream;

public class Main {
    public static final int SIZE_N = 5;
    public static final int SIZE_M = 5;
    public static int columnMS;
    public static int rowMS;

    public static void main(String[] args) {

        int[][] matrix = generateMatrix(SIZE_N, SIZE_M);
        System.out.println(Arrays.deepToString(matrix));

        int sum = stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
        System.out.println(sum);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> columnMultiplicationSum = executor.submit(new ColumnMultiplicationSum(matrix));
        Future<Integer> stringMultiplicationSum = executor.submit(new RowMultiplicationSum(matrix));

        while (true) {
            if (columnMultiplicationSum.isDone() && stringMultiplicationSum.isDone()) {
                try {
                    columnMS = columnMultiplicationSum.get();
                    rowMS = stringMultiplicationSum.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                } finally {
                    executor.shutdown();
                }
                break;
            }
        }

        System.out.println(Math.max(columnMS, rowMS));
    }

    public static int[][] generateMatrix(int n, int m) {
        Random random = new Random();
        int[][] matrix = new int[n][m];
        matrix = stream(matrix)
                .map(row -> stream(row)
                        .map(item -> random.nextInt(1, 3))
                        .toArray())
                .toArray(int[][]::new);
        return matrix;
    }
}
