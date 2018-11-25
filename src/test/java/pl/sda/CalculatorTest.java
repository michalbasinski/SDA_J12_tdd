package pl.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturn11ForArguments5And6() {
        //given
        final int argument1 = 5;
        final int argument2 = 6;
        final int expectedResult = 11;

        //when
        int result = calculator.add(argument1, argument2);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn100ForArguments55And45() {
        //given
        final int argument1 = 55;
        final int argument2 = 45;
        final int expectedResult = 100;

        //when
        int result = calculator.add(argument1, argument2);

        //then
        Assert.assertEquals(expectedResult, result);
        Assert.assertTrue(expectedResult == result);
    }

    @Test
    public void shouldThrowExceptionWhenDivisionBy0WasAttempted() {
        //given
        final float argument1 = 10;
        final float argument2 = 0;

        //when
        try {
            calculator.divide(argument1, argument2);
            Assert.fail("Wyjątek nie został rzucony!");
        } catch (DivideByZeroException e) {
            //then
            Assert.assertTrue(e instanceof DivideByZeroException);
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

}
