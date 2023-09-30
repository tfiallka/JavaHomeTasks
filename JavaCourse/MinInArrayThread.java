package task1;

public class MinInArrayThread extends Thread {
    private final int[] array;

    public MinInArrayThread(int[] array) {
        this.array = array;
    }

    public void run() {
        int minInArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minInArray > array [i]) {
                minInArray = array[i];
            }
        }
        System.out.println("min value: " + minInArray);
    }
}
