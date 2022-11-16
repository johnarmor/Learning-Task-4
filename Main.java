class Dog0 {
    //method for dog breed
    public void displayInfo() {
        System.out.println("French Bulldog");
    }
}
class Dog1 extends Dog0 {
    public void displayInfo() {
        System.out.println("Golden Retriever");
    }
}
class Dog2 extends Dog0 {
    public void displayInfo() {
        System.out.println("Bassett Hound");
    }
}
public class Main {
    public static void main (String[] args) {
        Dog1 d = new Dog1();
        d.displayInfo();
    }
}
