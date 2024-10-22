abstract class Bike {
    // Abstract method (no implementation)
    abstract void run();
}

class Honda4 extends Bike {
    // Implementing the abstract method in the subclass
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        // Creating an object of the Honda4 class, but using the abstract class reference
        Bike obj = new Honda4();
        obj.run();  // Calling the implemented run method
    }
}
