package streams;


import pojo.User;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User("aron", "jhon", "science",
                "5667663523", 50000L, Arrays.asList("sam@gmail.com", "sara@gmail.com"));
        User user2 = new User("jhon", "greg", "math",
                "576879792", 45000L, Arrays.asList("jgon@gmail.com", "gref@gmail.com"));
        User user3 = new User("pam", "kin", "English",
                "487978563", 8000l, Arrays.asList("pam@gmail.com", "kin@gmial.com"));
        User user4 = new User("jo", "devi", "math", "56903098",
                60000L, Arrays.asList("devi@gmail.com", "dev@gmail.com"));
        User user5 = new User("ratk", "mears", "English", "2079674",
                100000L, Arrays.asList("mears@gmail.com", "ratke@gmial.com"));
        User user6 = new User("jo", "gay", "science", "88756323",
                40000L, Arrays.asList("gay@gmail.com", "jo@gmail.com"));

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);


        //ITERATE  ALL USERS
        List<User> users = userList.stream().collect(Collectors.toList());
        System.out.println("All USERS  :" + users);

        //ITERATE USERS  GROUP BY DEPARTMENT
        Map<String,List<User>> userByDept = userList.stream().collect(Collectors.
                groupingBy(User::getDepartment));
        System.out.println("GROUP BY DEPARTMENT"+userByDept);

        //ITERATE USERS BY ABOVE 50000 SALARY WITH NAME

        Map<String, Long> highSalary = userList.stream().filter(user -> user.getSalary() > 50000).
                collect(Collectors.toMap(User::getFirstName, User::getSalary));
        System.out.println("ABOVE 50000 SALARY "+highSalary);

        //ITERATE LESS THAN 10000 SALARY
       List<User> lessSalary= userList.stream().filter(user -> user.getSalary()<10000).
               collect(Collectors.toList());
        System.out.println("LESS THAN 10000 SALARY"+lessSalary);

        //TO GET LASTNAME ONLY

        List<String> name=userList.stream().map(User::getLastName).collect(Collectors.toList());
        System.out.println("ONLY LASTNAME"+name);

        //SORT BY NAME
       List< User> sortedUsers= userList.stream().sorted(Comparator.comparing(User::getFirstName))
               .collect(Collectors.toList());
        System.out.println("USERS SORTED BY NAME"+sortedUsers);

        //MIN SALARY OF USER
         Optional< Long> minSalary=userList.stream().map(User::getSalary).
                collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println("MIN SALARY"+minSalary);

        //HIGHEST THREE SALARY
      List<User> top3Salary=userList.stream().sorted(Comparator.comparingLong(User::getSalary).reversed()).limit(3)
                .collect(Collectors.toList());
        System.out.println("TOP 3 SALARY"+top3Salary);

        //LOWEST FIVE SALARY
        Map<String,Long> fiveLowestSalary=userList.stream().sorted(Comparator.comparingLong(User::getSalary)).limit(3).
                collect(Collectors.toMap(User::getFirstName,User::getSalary));
        System.out.println("FIVE LOWEST SALARY WITH NAME"+fiveLowestSalary);

       //FIND SECOND HIGHEST SALARY
       Optional<User> salary= userList.stream().sorted(Comparator.comparingLong(User::getSalary).
               reversed()).skip(1).findFirst();
        System.out.println("SECOND HIGHEST SALARY"+salary);

        //FIND SUM OF ALL USERS SALARY
        Long totalSalary =userList.stream().collect(Collectors.summingLong(User::getSalary));
        System.out.println("TOTAL SALARY OF USERS  :"+totalSalary);

        //TO GET USERS FIRSTNAME AND PHONE NUMBER
        Map<String,String> user=userList.stream().collect(Collectors.
                toMap(User::getPhoneNumber,User::getFirstName));
        System.out.println("GET USERS PHONE NUMBER AND FIRSTNAME"+user);

       //REMOVE DUPLICATE NAME
        Set<User> userSet=userList.stream().collect(Collectors.toSet());
        System.out.println(userSet);
    }
    }