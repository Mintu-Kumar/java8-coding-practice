package OOPsConcept;

public class AutoPromotionInOverloading {
    public static void main(String[] args){
        Test t =  new Test();
        t.m1(10);
        t.m1(15.5f);
        t.m1('a');
        t.m1(10l);
    }
}
class Test{

    public void m1(int i){
        System.out.println("int-arg");
    }
    public void m1(float f){
        System.out.println("float-args");
    }
}
