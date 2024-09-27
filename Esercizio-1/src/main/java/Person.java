import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Person> friends;

    public Person(String name, int age, ArrayList<Person> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Person> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Person> friends) {
        this.friends = friends;
    }

    public void say() {
        System.out.println("Default");
    }
}
