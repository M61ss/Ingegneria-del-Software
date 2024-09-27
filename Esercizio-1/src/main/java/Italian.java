import java.util.ArrayList;

public class Italian extends Person {
    public Italian(String name, int age, ArrayList<Person> friends) {
        super(name, age, friends);
    }

    private void parla() {
        System.out.println("Ciao gente!");
    }

    @Override
    public void say() {
        parla();
    }
}
