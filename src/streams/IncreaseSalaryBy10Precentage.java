package streams;

import pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncreaseSalaryBy10Precentage {
    public static void main(String[] args) {
        List<Employee> employeeList =  new ArrayList<>();
        employeeList.add(new Employee("John",26,25000,"Science"));
        employeeList.add(new Employee("David",23,12000,"Science"));
        employeeList.add(new Employee("Peter",28,14000,"Science"));
        employeeList.add(new Employee("mark",18,10000,"Science"));

        System.out.println(employeeList);

        List<Employee> increasedSalary = employeeList.stream().map(e->{
            if (e.getAge()>25){
              e.setSalary(e.getSalary() * 1.10);
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println(increasedSalary);


    }
}
