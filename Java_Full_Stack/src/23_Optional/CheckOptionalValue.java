import java.util.Optional;

class MainValue {
    public static void main(String[] args) {
        ValueProvider2 provider = new ValueProvider2();
        // use provider.getValue() to get Optional<String>
        Optional<String> optionalInput = provider.getValue();
        optionalInput.ifPresent(System.out::println);
    }
}

class ValueProvider2 {
    private Optional<String> inputOpt; // cache to provide reproducing method invocation

    public Optional<String> getValue() {
        if (inputOpt == null) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String input = scanner.next();
            inputOpt = "null".equals(input) ? Optional.empty() : Optional.of(input);
        }

        return inputOpt;
    }
}