import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest {
    Calculator calculator = new Calculator();
    @Test
    public void divisionTestPositive(){
        Assert.assertEquals(calculator.division(10,5),2,"Division not valid");
    }
}
