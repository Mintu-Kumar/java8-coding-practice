package QuestionFacedInInterview;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MyClass{

    private void display(){
        System.out.println("Private method called");
    }
}
public class AccessPrivateMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        MyClass  myClass =  new MyClass();

        Method method = MyClass.class.getDeclaredMethod("display");
        method.setAccessible(true);

        method.invoke(myClass);
    }

}
