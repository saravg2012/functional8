package commonprogram;

import pojo.Employee;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodeContract {
    public static void main(String[] args) {

        Employee e1 =  new Employee("sara",55,50000,"Science");
        Employee e2 =  new Employee("sara",55,50000,"Science");

        if(e1.equals(e2)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set);

        String a ="10";
        String b ="10";

        if(a == b) {
            System.out.println("true");
        }else {
            System.out.println("False");
        }

        if(a.equals(b)) {
            System.out.println("true");
        }else {
            System.out.println("False");
        }


    }
}
