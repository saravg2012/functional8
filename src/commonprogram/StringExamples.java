package commonprogram;

public class StringExamples {

        public static void main(String arg[]) {
            String str = "welcome";
            //to iterate string
            for(int i=0;i<str.length();i++) {
                System.out.println(str.charAt(i));

            }
            System.out.println(" -----------------------------gap-----------");
            //to reverse string
            for (int i=str.length()-1;i>=0;i--){
                System.out.println(str.charAt(i));
            }
            //otherway to reverse string
            StringBuilder builder= new StringBuilder();
            builder.append(str);
            builder.reverse();
            System.out.println(builder);

            //to make uppercase or lowecase

            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());


        }
    }

