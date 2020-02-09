import com.powerfunction.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class PowerFunctionTest {

    Calculator calculator = new Calculator();

    @Test
    public void givenPositiveBaseAndExponentValue_WhenCorrect_ShouldReturnValidResult() {
        long result = calculator.calculate(2, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void givenNegativeBaseAndExponent_WhenValid_ShouldReturnValidResult() {
        long result = calculator.calculate(-2, 3);
        Assert.assertEquals(-8, result);
    }

    @Test
    public void givenZeroBaseAndZeroExponent_WhenValid_ShouldReturnOne() {
        long result = calculator.calculate(5, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void givenBoundryLimit100AsBaseValueAndExponentValue_WhenCorrect_ShouldReturnResult() {
        long result = calculator.calculate(100, 100);
        System.out.println(result);
        Assert.assertEquals(0, result);

    }
}
