/*
* Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
* */

fun main() {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map{ number ->
            if (number % 3 == 0 && number %  5 == 0) "FizzBuzz"
            else if (number % 3 == 0) "Fizz"
            else if (number %  5 == 0) "Buzz" else "$number"
        }
    }
    fizzBuzz(15)
}