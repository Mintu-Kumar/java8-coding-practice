package QuestionFacedInInterview;

import java.sql.SQLOutput;
import java.util.Stack;

/**
 * Here we will do experiment on Object class toString method and .equals method
 */
public class Student {
    String  name;
    int rollNo;

    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    // Implemented to test override object class toString method
   /* public String toString(){
        return name+"  :  "+rollNo;
    }*/

    public static void main(String [] args){
        Student s1 =  new Student("Mintu",1);
        Student s2 =  new Student("Anu",2);
        Student s3 =  new Student("Mintu",1);
        Student s4 =  s1;
        /*System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));*/
        /*System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);*/

        /*System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s3);*/

        String s5 =  new String("Mintu");
        String s6 =  new String("Mintu");
        String s7 = s5;
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        System.out.println(s7==s5);
    }

}
