package fi.academy.Main;

public class Person {
    private String name;
    private int age;

    public Person(String name, int ika){
        this.name = name;
        this.age = ika;
    }
    public Person() {
        this("A",0);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name +"age" +age;
    }
}
