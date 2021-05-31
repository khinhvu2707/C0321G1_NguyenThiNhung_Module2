package _19_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    public static final String TELEPHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(TELEPHONE_REGEX);
        String test = "(84)-(0987654321)";
            Matcher matcher = pattern.matcher(test);
            System.out.println("telephone : "+test + matcher.matches());
        String test2 = "(a4)-(09876543)";
        Matcher matcher2 = pattern.matcher(test2);
        System.out.println("telephone : "+test + matcher2.matches());
        }
    }

