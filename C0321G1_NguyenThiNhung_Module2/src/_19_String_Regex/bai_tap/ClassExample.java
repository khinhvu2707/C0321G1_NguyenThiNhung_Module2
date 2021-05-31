package _19_String_Regex.bai_tap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ClassExample {

    private static final String CLASS_REGEX ="^[APC]\\d{4}[GHIKLM]$";

    public ClassExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
