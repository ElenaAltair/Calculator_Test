import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainDevide() {
        int a=2;
        int b=0;
        Calculator calc = Calculator.instance.get();

        int result = calc.devide.apply(a, b);

        Assertions.assertTrue(result==0);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,2,true",
            "0,0,true",
            "2,0,true",
    })
    public void ParameterizedTest(int a, int b, boolean expected) {
        Calculator calc = Calculator.instance.get();
        int result = calc.devide.apply(a, b);

        Assertions.assertEquals(expected, result == 0);
    }

    @Test
    void mainMinesPositiv() {
        int a=10;
        int b=-5;
        Calculator calc = Calculator.instance.get();

        int result = calc.devide.apply(a, b);

        Assertions.assertTrue(result<0);
    }

    @Test
    void mainMinesNegetiv() {
        int a=10;
        int b=-5;

        Calculator calc = Calculator.instance.get();

        int result = calc.devide.apply(a, b);

        Assertions.assertFalse(result>0);
    }
}