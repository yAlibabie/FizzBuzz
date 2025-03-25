import java.util.List;

public class FizzBuzz {

    public final List<Rule> rules;

    public FizzBuzz(List<Rule> rules) {
        this.rules = rules;
    }

    public String ProcessNumber (int number) {
        String result = "";

        for(Rule rule : rules) {
            if(rule.IsMatch(number)) {
                result += rule.getReplacement();
            }
        }
        if(result.isEmpty()) {
            return String.valueOf(number);
        } else {
            return result;
        }
    }

    public void run(int end) {
        for (int i = 1; i<= end; i++) {
            System.out.println(ProcessNumber(i));
        }
    }
}
