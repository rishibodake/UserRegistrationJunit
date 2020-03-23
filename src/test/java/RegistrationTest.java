import org.junit.Assert;
import org.junit.Test;


public class RegistrationTest {
   Registration obj = new Registration();
   @Test
   public void givenfirstName_whenValid_thenTrue() {
       boolean firstname=obj.checkName("Capital");
       Assert.assertTrue(firstname);
   }

    @Test
    public void givenfirstName_whenInValid_thenFalse() {
        boolean firstname=obj.checkName("Capital");
        Assert.assertFalse(firstname);
    }


}
