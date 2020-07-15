package BT_fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void getResult() {
        String result = FizzBuzz.getResult(76);
        assertEquals("seventy - six", result);
    }

    @Test
    void getResult1() {
        String result = FizzBuzz.getResult(66);
        assertEquals("Fizz", result);
    }

    @Test
    void getResult2() {
        String result = FizzBuzz.getResult(20);
        assertEquals("Buzz", result);
    }

    @Test
    void getResult3() {
        String result = FizzBuzz.getResult(75);
        assertEquals("FizzBuzz", result);
    }
}