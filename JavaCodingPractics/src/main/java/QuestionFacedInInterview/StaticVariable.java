package QuestionFacedInInterview;

/**
 * what is static key word. if a variable is defined as static can it be printed in main
 */
public class StaticVariable {
    static int staticVar = 10;

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}

class Main {

    public static void main(String[] args) {
        // Access static variable directly through the class
        System.out.println(StaticVariable.staticVar);  // Output: 10

        // Call static method directly through the class
        StaticVariable.staticMethod();  // Output: This is a static method.

        // You can also access the static variable and method via an object
        StaticVariable obj = new StaticVariable();
        System.out.println(obj.staticVar);  // Output: 10
        obj.staticMethod();  // Output: This is a static method.
    }
}
