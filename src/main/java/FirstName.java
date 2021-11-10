import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FirstName class is used to check the users name with regex
 */
public class FirstName {
    /**
     * This method takes First Name which starts with Cap
     * and has minimum of 3 characters
     * @param name is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isFirstName(String name) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        FirstName fm = new FirstName();
        System.out.println(fm.isFirstName("Saran"));
        System.out.println(fm.isFirstName("SaraN"));
    }
}
