import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnAFizzBuzzClassWhenCalled(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertNotNull(fizzBuzz);
    }

    @Test
    public void shouldReturnFizzWhenIntDivisibleByThreeIsPassed(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnFizzWhenIntDivisibleByThreeIsPassed_2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(6);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenIntDivisibleByFiveIsPassed(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnBuzzWhenIntDivisibleByFiveIsPassed_2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(10);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenIntDivisibleByBothThreeAndFiveIsPassed(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(15);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenIntDivisibleByBothThreeAndFiveIsPassed_2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(30);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldNotReturnFizzNorBuzzWhenIntIsNotDivisibleByThreeOrFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(1);
        Assert.assertEquals("1", result);
    }
}
