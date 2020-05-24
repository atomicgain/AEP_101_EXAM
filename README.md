# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

- 让所有学生排成一队，然后按顺序报数。

- 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。


## tasking

~~~
GIVEN 学生报数时，原本应该报 1
WHEN 报数
THEN 实际报数为 1

GIVEN 学生报数时，原本应该报 3 
WHEN 报数
THEN 实际报数为 Fizz

GIVEN 学生报数时，原本应该报 4
WHEN 报数
THEN 实际报数为 4

GIVEN 学生报数时，原本应该报 5 
WHEN 报数
THEN 实际报数为 Buzz

GIVEN 学生报数时，原本应该报 6
WHEN 报数
THEN 实际报数为 Fizz

GIVEN 学生报数时，原本应该报 7 
WHEN 报数
THEN 实际报数为 Whizz

GIVEN 学生报数时，原本应该报 10
WHEN 报数
THEN 实际报数为 Buzz

GIVEN 学生报数时，原本应该报 14
WHEN 报数
THEN 实际报数为 Whizz

GIVEN 学生报数时，原本应该报 15
WHEN 报数
THEN 实际报数为 FizzBuzz

GIVEN 学生报数时，原本应该报 21
WHEN 报数
THEN 实际报数为 FizzWhizz

GIVEN 学生报数时，原本应该报 35
WHEN 报数
THEN 实际报数为 BuzzWhizz

GIVEN 学生报数时，原本应该报 105
WHEN 报数
THEN 实际报数为 FizzBuzzWhizz
~~~


