import org.junit.Assert;
import org.junit.Test;


public class RegistrationTest {
   Registration obj = new Registration();
   @Test
   public void givenfirstName_whenValid_thenTrue() {
       boolean firstname=obj.checkName("Abhishek");
       Assert.assertTrue(firstname);
   }

    @Test
    public void givenfirstName_whenInValid_thenFalse() {
        boolean firstname=obj.checkName("Abhishek");
        Assert.assertFalse(firstname);
    }

    @Test
    public void givenlastName_whenValid_thenTrue() {
        boolean lastname=obj.checkName("Abhishek");
        Assert.assertTrue(lastname);
    }
    @Test
    public void givenlastName_wheninValid_thenFalse() {
        boolean lastname=obj.checkName("Abhishek");
        Assert.assertFalse(lastname);
    }
}

