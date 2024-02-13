import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void testDevide() {
        int a = 2;
        int b = 0;
        Calculator calc = Calculator.instance.get();

        int result = calc.devide.apply(a, b);

        Assertions.assertTrue(result == 0);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,2,true",
            "0,0,true",
            "2,0,true",
            "10,2,false"
    })
    public void testParameterized(int a, int b, boolean expected) {
        Calculator calc = Calculator.instance.get();
        int result = calc.devide.apply(a, b);

        Assertions.assertEquals(expected, result == 0);
    }

    @Test
    public void testMinesPositiv() {
        int a = 10;
        int b = -5;
        Calculator calc = Calculator.instance.get();

        int result = calc.devide.apply(a, b);

        Assertions.assertTrue(result == -2);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-5,-2,true",
            "5,2,true",
            "-5,2,true",
            "10,-2,true",
            "0,5,false"
    })
    public void testMinesPlus(int a, int b, boolean expected) {
        Calculator calc = Calculator.instance.get();

        boolean result = (((a > 0 && b > 0) || (a < 0 && b < 0)) && a != 0 && b != 0) ? calc.devide.apply(a, b) > 0 : calc.devide.apply(a, b) < 0;

        Assertions.assertEquals(expected, result);
    }

}