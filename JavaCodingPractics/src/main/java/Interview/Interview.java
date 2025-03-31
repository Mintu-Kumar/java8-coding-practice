package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  Capgemini interview question
 */
public class Interview {

    public  static void main(String [] args){
       String str = "welcome to my project";

       //output = tcejorp ym ot emocleW

       List<Character> list =  str.chars().mapToObj(c->(char)c).collect(Collectors.toList());

    String reverseString =   list.stream().collect(StringBuilder::new, (sb,c)->sb.insert(0,c),StringBuilder::append).toString();
        System.out.println(reverseString);

       // epmloyee
              //  adreess

               // select * from epmloyee e eddress a where e.epmId == a.empId;

    }


}
