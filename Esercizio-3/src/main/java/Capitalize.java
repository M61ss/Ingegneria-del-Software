public class Capitalize implements Format {
    private String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    @Override
    public String format(String input) {
        return capitalize(input);
    }
}
