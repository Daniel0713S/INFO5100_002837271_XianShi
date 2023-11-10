import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String zipcode = "\\b[0-9]{5}(?:-[0-9]{4})?\\b";
        String pin = "\\d{4}"; // any four digits
        String DOB = "\\b(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)[0-9]{2}\\b"; //01/01/1900 through 12/31/2099
        String SSN = "\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b";
        String PhoneNum = "\\b[0-9]{3}-[0-9]{3}-[0-9]{4}\\b"; //U.S. phone number

        //POSITIVE
        String t1 = "95613-0001";
        String t2 = "0000";
        String t3 = "07/13/1998";
        String t4 = "111-22-3333";
        String t5 = "530-760-5417";


        //NEGATIVE
        String t6 = "4321-123";
        String t7 = "abcd";
        String t8 = "22-22-2222";
        String t9 = "432";
        String t10 = "5432-31-320";

        test(zipcode, t1);
        test(pin, t2);
        test(DOB, t3);
        test(SSN, t4);
        test(PhoneNum, t5);

        test(zipcode, t6);
        test(pin, t7);
        test(DOB, t8);
        test(SSN, t9);
        test(PhoneNum, t10);



    }

    public static void test(String pattern, String test){
        Pattern patterns = Pattern.compile(pattern);
        Matcher matchers = patterns.matcher(test);

        System.out.println(pattern);
        System.out.println(test);

        if(matchers.matches()){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }

        System.out.println("\n");
    }

}

