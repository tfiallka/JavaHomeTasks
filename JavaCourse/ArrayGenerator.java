import java.util.Random;

public abstract class ArrayGenerator {

    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1, 20);
        }
        return array;
    }

    public static int[] generateArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(min, max);
        }
        return array;
    }
}
