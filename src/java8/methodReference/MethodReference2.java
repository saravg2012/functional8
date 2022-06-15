package java8.methodReference;

import pojo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        Student sss = new Student("ABCD", 14, "Literature", 71.5);

        studentList.forEach(student -> System.out.println(student));
        System.out.println("---------------------------------------");
        studentList.forEach(System.out::println);
        System.out.println("---------------------------------------");
        studentList.stream()
                .map(student -> student.getName()) // Here map transform from Student object to name
                .forEach(System.out::println);
        System.out.println("---------------------------------------");
        studentList.stream()
                .map(Student :: getName) // Here map transform from Student object to name
                .forEach(System.out::println);
        System.out.println("---------------------------------------"); // Use of method reference by constructor
        List<String> names = Arrays.asList("Daniel","Rubert","Emma");
        List<Student> nameStudentList = names.stream()
                .map(name -> new Student(name))
                .collect(Collectors.toList());
        System.out.println(nameStudentList);
        System.out.println("---------------------------------------");
        List<Student> nameStudentList2 = names.stream()
                .map(Student::new)
                .collect(Collectors.toList());
        System.out.println(nameStudentList);
        System.out.println("---------------------------------------");
        studentList.forEach(sss::printMyName); // Instance of class reference can be used.

    }
}
