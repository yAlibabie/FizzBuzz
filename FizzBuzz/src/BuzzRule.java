public class BuzzRule implements Rule{

    @Override
    public boolean IsMatch(int number) {
        return (number % 5 == 0);
    }

    @Override
    public String getReplacement() {
        return "Buzz";
    }
}
