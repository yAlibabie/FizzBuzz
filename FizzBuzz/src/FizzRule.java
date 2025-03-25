public class FizzRule implements Rule  {

    @Override
    public boolean IsMatch(int number) {
        return (number % 3 == 0) ;
    }

    @Override
    public String getReplacement () {
        return "Fizz" ;
    }
}
