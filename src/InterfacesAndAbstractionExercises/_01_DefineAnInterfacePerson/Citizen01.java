package InterfacesAndAbstractionExercises._01_DefineAnInterfacePerson;

public class Citizen01 implements Person{
    private String name;
    private int age;

    public Citizen01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
