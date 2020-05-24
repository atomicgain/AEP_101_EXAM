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
}
