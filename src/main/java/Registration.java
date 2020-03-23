import java.util.regex.Pattern;

public class Registration {
    String defaultPattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    String mobilePattern="[0-9]{2}[ ]{1}[0-9]{10}$";
    String passwordPattern="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*)|([a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]+[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*)$";


    public boolean checkName(String Abhishek) {

        return Pattern.matches(defaultPattern,Abhishek);
    }
    public boolean checkEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }

    public boolean checkMobileNumber(String mobileNumber) {
        return Pattern.matches(mobilePattern,mobileNumber);
    }

    public boolean checkPassword(String password){
        return  Pattern.matches(passwordPattern,password);
    }
}
