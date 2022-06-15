package java8.optional;

import pojo.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) throws Throwable {
        Customer customer = new Customer(101, "John","g@mail.com", Arrays.asList("397937955", "21654725"));
        //empty
        //of
        //ofNullable

      //  Optional<Object> emptyOptional = Optional.empty();
       // System.out.println(emptyOptional);



        Optional<String> name = Optional.of(customer.getName());
        System.out.println(name);
      //  Optional<String> email = Optional.of(customer.getEmail());
      //  System.out.println(email);

        Optional emailOptional2 = Optional.ofNullable(customer.getEmail());
       if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }
        String str = (String) emailOptional2.orElse("default@email.com");
        System.out.println(str);

        System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email not present")));

        //System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email..."));

          try {
              getCustomerByEmailId("pqr");
          }catch (Exception e) {
              System.out.println(e.fillInStackTrace());
          }


    }


    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers = CustomerDataBase.getAll();
        return customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(()->new Exception("no customer present with this email id"));
    }
}
