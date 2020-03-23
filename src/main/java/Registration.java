import java.util.regex.Pattern;

public class Registration {
    String defaultPattern="^[A-Z][a-zA-Z]{2,}$";

    public boolean checkName(String capital) {

        return Pattern.matches(defaultPattern,capital);
    }
}
