package HCTTestAssesment;

public class TryCatch {

    public static void test(){

        try{
            badMethod();
            System.out.println("A");
        }
        catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod(){
        throw new Error();
    }
    public static void main(String[] args){
       test();
    }
}


