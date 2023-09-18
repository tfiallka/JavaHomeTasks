public class Pair<T> {
    private T firstElement;
    private T secondElement;

    public T first() {
        return firstElement;
    }

    public T last() {
        return secondElement;
    }

    public void swap() {
        T swap = firstElement;
        firstElement = secondElement;
        secondElement = swap;
    }

    public void replaceFirst(T element) {
        firstElement = element;
    }

    public void replaceLast(T element) {
        secondElement = element;
    }
}
