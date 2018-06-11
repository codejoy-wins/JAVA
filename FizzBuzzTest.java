public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz temp = new FizzBuzz();
        String answer;
        answer = temp.fizzBuzz(3);
        System.out.println(answer);
        System.out.println(temp.fizzBuzz(5));
        System.out.println(temp.fizzBuzz(15));
        System.out.println(temp.fizzBuzz(25));
        System.out.println(temp.fizzBuzz(14));
    }
}