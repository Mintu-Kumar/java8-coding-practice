package Interview;

import Employee.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tenerity {

   /* public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        //Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Map<String,List<Employee>> map =  new HashMap<>();
        List<Employee> mapList = new ArrayList<>();
        for(int i=0;i<list.size();i++){

            Employee employee  =  list.get(i);
            if(map.containsKey(employee.getDepartment())){
                map.put(employee.getDepartment(),mapList.add(employee));
            }
            else{
                map.put(employee.getDepartment(),map.get(employee.getDepartment()).add(employee));
            }
        }

    }*/
}
