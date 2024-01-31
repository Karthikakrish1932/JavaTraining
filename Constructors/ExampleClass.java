public class ExampleClass {
    private int value;

    // Default constructor
    ExampleClass() {
        value = 0;
    }

    // Constructor with one parameter
    ExampleClass(int singleValue) {
        value = singleValue;
    }

    // Constructor with two parameters
    ExampleClass(int firstValue, int secondValue) {
        value = firstValue + secondValue;
    }

    // Display the result
    public void displayResult() {
        System.out.println("The value is: " + value);
    }

    public static void main(String[] args) {
        // Instantiate objects using different constructors
        ExampleClass obj1 = new ExampleClass();
        ExampleClass obj2 = new ExampleClass(5);
        ExampleClass obj3 = new ExampleClass(2, 3);

        // Display the results
        obj1.displayResult();
        obj2.displayResult();
        obj3.displayResult();
    }
}