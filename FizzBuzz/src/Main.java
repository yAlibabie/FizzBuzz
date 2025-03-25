
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(Arrays.asList(new FizzRule() , new BuzzRule()));
        fizzBuzz.run(100);
    }
}