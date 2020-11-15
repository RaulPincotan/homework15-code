package ex2;


public class Person {
    private final String name;
    private final int age;
    private int ID;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        if (name == null) {
            throw new InvalidNameException("That is not a valid name");
        }
        return name;
    }

    public int getAge() {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age is invalid");
        } else {
            return age;

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
