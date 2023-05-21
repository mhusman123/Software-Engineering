public class Class2 {
    public void displayMessage() {
        System.out.println("Hello from Class2!");
    }

    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();

        obj1.displayMessage();
        obj2.displayMessage();
    }
}
