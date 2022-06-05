package streams;


import pojo.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        List<String> colors= Arrays.asList("red","blue","green","yellow");
       Collections.sort(colors);
       // List<String> sortedcolor= colors.stream().sorted().collect(Collectors.toList());
        System.out.println(colors);
     //userdefined object we can not sort without comparator
        List<Student>  sortedStudent=studentList.stream().sorted
                (Comparator.comparingDouble(Student::getPercentage)).collect(Collectors.toList());
        System.out.println("sorted by ASC "+sortedStudent);

        List<Student>  reversesortedStudent=studentList.stream().sorted
                (Comparator.comparingDouble(Student::getPercentage).reversed()).collect(Collectors.toList());
        System.out.println("sorted by DEC "+reversesortedStudent);

        //Collectors.toSet() :
        Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        System.out.println("Collectors.toSet() :"+subjects);

        //Collectors.toMap() :
        Map<String, Double> namePercentageMap = studentList.stream().collect
                (Collectors.toMap(Student::getName, Student::getPercentage));

        System.out.println(namePercentageMap);

        //Collectors.counting(Counting number of students)
        Long studentCount = studentList.stream().collect(Collectors.counting());

        System.out.println(studentCount);

        //Collectors.maxBy(Collecting highest percentage)
        Optional<Double> highPercentage = studentList.stream().map(Student::getPercentage)
                .max(Comparator.naturalOrder());
        //.collect(Collectors.maxBy(Comparator.naturalOrder));

        System.out.println(highPercentage);

        //Collectors.minBy( Collecting lowest percentage)
        Optional<Double> lowPercentage = studentList.stream().map(Student::getPercentage)
               // .collect(Collectors.minBy(Comparator.naturalOrder()));
                       .min(Comparator.naturalOrder());

        System.out.println("Collectors.minBy() "+lowPercentage);

        //Collectors.groupingBy(Grouping the students by subject)
        Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().
                collect(Collectors.groupingBy(Student::getSubject));

        System.out.println("Collectors.groupingBy() : "+studentsGroupedBySubject);


        //summingInt(), summingLong(), summingDouble()=These methods returns a Collector which collects sum of all input elements.

        Double sumOfPercentages = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
        System.out.println(sumOfPercentages);

        //max() using lambda
        Student studentA = studentList.stream().max((student1,student2) -> student1.getPercentage() > student2.getPercentage() ?1 :-1).get();
        System.out.println("Max getPercentage Student : "+studentA);
        System.out.println(studentA.getPercentage());

        //mni() using lambda
        Student studentMin = studentList.stream().min((student1,student2) -> student1.getPercentage() > student2.getPercentage() ?1 :-1).get();
        System.out.println("Min getPercentage Student : "+studentMin);
        System.out.println(studentMin.getPercentage());

        Set<Double> studentSub = studentList.stream().map(Student::getPercentage).collect(Collectors.toSet());

        System.out.println(studentSub);
        System.out.println("------------------------------------------------");


        List<Student> sortbyName = studentList.stream().sorted(Comparator.comparing(Student::getName)).
                collect(Collectors.toList());
        System.out.println(sortbyName);

        List<Student>  reverseByName = studentList.stream().sorted(Comparator.comparing(Student::getName).reversed()).
                collect(Collectors.toList());
        System.out.println(reverseByName);

        Map<String,List<Student>> groupBySub = studentList.stream().collect
             (Collectors.groupingBy(Student::getSubject));
        System.out.println(groupBySub);

         Optional<Double> minnum = studentList.stream().map(Student::getPercentage).
                collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(minnum);

        Double sum=studentList.stream().
                collect(Collectors.summingDouble(Student::getPercentage));
        System.out.println(sum);


        //filter above 80%
     Map<String,Double> highpercentage = studentList.stream().filter(student -> student.getPercentage()>80).
               collect(Collectors.toMap(Student::getName,Student::getPercentage));
        System.out.println(highpercentage);
    }






}
