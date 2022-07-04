package streams;

import pojo.Employee;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.IntStream;

public class SequentialVsParallelStream {

    public static void main(String[] args) {
        long start=0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.range(1,50).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain Stream  ::" +(end-start));
        System.out.println("================================");

        start = System.currentTimeMillis();
        IntStream.range(1,50).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream  ::" +(end-start));

        System.out.println("===============================================================");

        IntStream.range(1,10).forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName()+" : " +x);
        });
        System.out.println("===============================================================");
        IntStream.range(1,10).parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName()+" : " +x);
        });

        List<Employee> employees = EmployeeDatabase.getEmployees();

        //normal
        start=System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Normal stream execution time : "+(end-start)+" : Avg salary : "+salaryWithStream);

        start=System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();

        end=System.currentTimeMillis();

        System.out.println("Parallel stream execution time : "+(end-start)+" : Avg salary : "+salaryWithParallelStream);
    }


    }

