public class IteratorForArray<T> {
    private int i;
    private final T[] array;

    public IteratorForArray(T[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return i < array.length;
    }

    public T next() {
        return array[i++];
    }

}
