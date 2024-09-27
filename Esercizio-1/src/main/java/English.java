import java.util.ArrayList;

public class English extends Person {
    public English(String name, int age, ArrayList<Person> friends) {
        super(name, age, friends);
    }

    private void speak() {
        System.out.println("Hello world!");
    }

    @Override
    public void say() {
        speak();
    }
}
