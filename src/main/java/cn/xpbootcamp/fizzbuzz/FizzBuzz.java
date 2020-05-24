package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String say(int i) {
        String res = "";

        if (i%3==0)
            res += "Fizz";
        else
            res += String.valueOf(i);
        return res;
    }
}
