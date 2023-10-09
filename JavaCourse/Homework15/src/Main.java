import java.util.*;
public class Main {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        col.add(5);
        col.add(6);
        col.add(2);
        col.add(4);

        System.out.println("Max value: " + col.stream().max(Integer::compareTo).get());
        System.out.println("Min value: " + col.stream().min(Integer::compareTo).get());
        System.out.println("Avg value: " + col.stream().mapToInt(a -> a).average().getAsDouble());
        System.out.println("Sum of elements: " + col.stream().mapToInt(a -> a).sum());
        System.out.println("Multiplied elements: " + col.stream().mapToInt(a -> a).reduce((a, b) -> (a * b)).getAsInt());
        System.out.println("Sum of digits of elements: " + col.stream().mapToInt(a -> a.toString().chars().map(Character::getNumericValue).sum()).sum());

        List<String> myList = Arrays.asList("b1", "b3", "c2", "a1", "a2", "a3", "c1", "c5");

        List<String> wordStrings = myList.stream()
                .filter(a -> !a.matches(".3"))
                .sorted(Comparator.reverseOrder())
                .sorted(Comparator.comparing(a -> a.replaceAll("^\\D", "")))
                .skip(1)
                .limit(myList.size() - 2)
                .map(a -> a.toUpperCase())
                .toList();
        System.out.println("Number of elements after all actions: " + wordStrings.stream().count());
        wordStrings.stream().forEach(a -> System.out.print(a + " "));
    }
}

