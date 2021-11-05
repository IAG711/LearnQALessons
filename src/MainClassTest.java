import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("Local number != 14",getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("Class number < 45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString(){
        Assert.assertTrue("Word 'Hello' is not present in the string", getClassString().toLowerCase().contains("Hello".toLowerCase()));
    }
}
