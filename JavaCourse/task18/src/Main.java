public class Main {
    public static void main(String[] args) {
            Store store = new Store();
            new Consumer(store);
            new Producer(store);
    }
}