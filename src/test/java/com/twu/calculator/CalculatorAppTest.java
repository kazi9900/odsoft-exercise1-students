package com.twu.calculator;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorAppTest {
    ByteArrayInputStream inputContent = new ByteArrayInputStream("add 10\n".getBytes());
    ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setIn(inputContent);
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void shouldStartTheCalculator() {
        Calculator calculator = new Calculator();
        CalculatorApp calculatorApp = new CalculatorApp(calculator);
        calculatorApp.start(false);

        String actualResult = outputContent.toString();

        assertThat(actualResult, is("> 10.0"+System.getProperty("line.separator")));
    }


    public class Factorial {
        public  int compute(int n) {
            if (n < 0)
                throw new IllegalArgumentException("Negative input: + n");
            return IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
        }
    }
    @Test
    public void shouldStartThiredCalculatTest() {
        ByteArrayInputStream inputContent = new ByteArrayInputStream("add n\3".getBytes());
        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    }

    //TODO ADD NEW INTEGRATION TEST FOR FACTORIAL AND THIRD

    @After
    public void tearDown() {
        System.setIn(System.in);
        System.setOut(null);
    }
}
