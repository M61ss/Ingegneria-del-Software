public class User {
    public User() {
    }

    String modify(String input, Format choice) {
        return choice.format(input);
    }

    public static void main(String[] args) {
        User user = new User();
        String modified = user.modify("Input", new UpperCaser());
        System.out.println(modified);
    }
}
