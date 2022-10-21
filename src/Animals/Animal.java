package Animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "не указано имя";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("спать");
    }

    void go() {
        System.out.println("перемещаться");
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + '\'' + ", age" + age + '}';
    }

    public boolean equals(Animal a) {
        if (this.hashCode() == a.hashCode()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}

