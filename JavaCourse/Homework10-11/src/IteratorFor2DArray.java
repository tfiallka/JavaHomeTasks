public class IteratorFor2DArray<T> {
    private int i, j;
    private final T[][] array;

    public IteratorFor2DArray(T[][] array) {
        this.array = array;
    }


    public boolean hasNext() {
        for (int i = this.i; i < array.length; i++) {
            for (int j = this.j; j < array[i].length; j++) {
                return true;
            }
        }
        return false;
    }


    public T next() {
        T t = array[i][j];
        j++;
        for (int i = this.i; i < array.length; i++) {
            for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
                this.i = i;
                this.j = j;
                return t;
            }
        }
        return t;
    }

}


