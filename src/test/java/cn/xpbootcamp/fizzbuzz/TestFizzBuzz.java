package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFizzBuzz {
    FizzBuzz fizzBuzz =  new FizzBuzz();

    @Test
    public void should_return_1_when_number_is_1(){
        assertThat(fizzBuzz.say(1)).isEqualTo("1");
    }

    @Test
    public void should_return_Fizz_when_number_is_3(){
        assertThat(fizzBuzz.say(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_4_when_number_is_4(){
        assertThat(fizzBuzz.say(4)).isEqualTo("4");
    }

    @Test
    public void should_return_Buzz_when_number_is_5(){
        assertThat(fizzBuzz.say(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Fizz_when_number_is_6(){
        assertThat(fizzBuzz.say(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Whizz_when_number_is_7(){
        assertThat(fizzBuzz.say(7)).isEqualTo("Whizz");
    }

    @Test
    public void should_return_Buzz_when_number_is_10(){
        assertThat(fizzBuzz.say(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Whizz_when_number_is_14(){
        assertThat(fizzBuzz.say(14)).isEqualTo("Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_15(){
        assertThat(fizzBuzz.say(15)).isEqualTo("FizzBuzz");
    }

}
