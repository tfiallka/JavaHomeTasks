public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        IteratorForArray<String> iterator1 = new IteratorForArray<>(array);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        Integer[][] array2 = new Integer[][]{{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        IteratorFor2DArray<Integer> iterator2 = new IteratorFor2DArray<>(array2);
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
