import org.junit.Assert;
import org.junit.Test;


public class RegistrationTest {
    Registration obj = new Registration();

    @Test
    public void givenfirstName_whenValid_thenTrue() {
        boolean firstname = obj.checkName("Abhishek");
        Assert.assertTrue(firstname);
    }

    @Test
    public void givenfirstName_whenInValid_thenFalse() {
        boolean firstname = obj.checkName("Abhishek");
        Assert.assertFalse(firstname);
    }

    @Test
    public void givenlastName_whenValid_thenTrue() {
        boolean lastname = obj.checkName("Abhishek");
        Assert.assertTrue(lastname);
    }

    @Test
    public void givenlastName_wheninValid_thenFalse() {
        boolean lastname = obj.checkName("Abhishek");
        Assert.assertFalse(lastname);
    }


    @Test
    public void givenEmail_whenValid_thenTrue() {
        boolean email = obj.checkEmail("rishibodake@gmail.com");
        Assert.assertTrue(email);
    }


    @Test
    public void givenMobileNumber_whenValid_thenTrue() {
        boolean mobileNumber=obj.checkMobileNumber("91 9028809307");
        Assert.assertTrue(mobileNumber);
    }

    @Test
    public void givenPassword_whenValid_thenTrue(){
        boolean Password=obj.checkPassword("aaag56ghh*tHHggt");
        Assert.assertTrue(Password);
    }

    @Test
    public void givenPassword_whenInvalid_thenFalse() {
        boolean Password=obj.checkPassword("asdghj77lhjKKKh");
        Assert.assertFalse(Password);
    }
}
