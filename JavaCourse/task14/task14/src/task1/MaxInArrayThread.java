package task1;

public class MaxInArrayThread extends Thread {
    private final int[] array;

    public MaxInArrayThread(int[] array) {
        this.array = array;
    }

    public void run() {
        int maxInArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxInArray < array[i]) {
                maxInArray = array[i];
            }
        }

        System.out.println("Max value: " + maxInArray);

    }
}
