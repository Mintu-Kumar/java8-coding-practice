package Capg;

import java.lang.module.Configuration;
import java.sql.SQLOutput;

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




