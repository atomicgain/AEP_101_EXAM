package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String say(int i) {
        String res = "";

        if (i%3==0)
            res += "Fizz";
        if (i%5==0)
            res += "Buzz";
        if (i%3!=0 && i%5!=0)
            res += String.valueOf(i);
        return res;
    }
}
