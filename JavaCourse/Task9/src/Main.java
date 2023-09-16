public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(8);
        myStack.push(7);
        myStack.push(2);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        myStack.push(9);
        System.out.println("Max element = " + myStack.findMax());
        System.out.println(myStack);
        System.out.println("Max element = " + myStack.findMax());
        System.out.println(CharactersInString.getCharsCount("abbbca bcggd  hjkk"));

    }
}