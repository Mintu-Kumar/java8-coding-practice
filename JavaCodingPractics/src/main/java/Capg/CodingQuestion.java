package Capg;

/**
 * More question on singleton design pattern
 * How many ways to declare singleton design pattern
 * 1. Eager(Eager Initialization) way to declare singleton design pattern
 * 2. Lazy Initialization (Non-thread Safe) to create singleton design pattern
 */

// This is Lazy Initialization
 public class CodingQuestion {

    private static CodingQuestion instance;
    private CodingQuestion(){

    }

    public static CodingQuestion getInstance(){

        if(instance == null)
        {instance =  new CodingQuestion();}

        return instance;
    }
    public void display(){
        System.out.println("Hello");
    }


    public static void main(String [] args){

        CodingQuestion  c =  getInstance();
        c.display();
        CodingQuestion c1 = getInstance();
        System.out.println(c);
        System.out.println(c1);
    }


}

// Lazy Initialization
class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}  // Private constructor

    public static Singleton getInstance() {
        return INSTANCE;
    }
}




