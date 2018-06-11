public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        else {
            return Integer.toString(number);
        }
    }
}
