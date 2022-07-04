package streams;

import pojo.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getEmployees(){
        return  Stream.of(new Employee("john",25,60000.0,"Science"),
                        new Employee("peter",50,30000.00,"Science"),
                        new Employee("mak",20,80000.00,"Science"),
                        new Employee("kim",60,90000,"Science"),
                        new Employee("json",27,15000,"Science"))
                .collect(Collectors.toList());
    }
}
