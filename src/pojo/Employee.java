package pojo;

import java.util.Objects;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private String dept;

    public Employee(String name, int age, double salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, dept);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
