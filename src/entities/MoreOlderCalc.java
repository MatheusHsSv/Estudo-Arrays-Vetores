package entities;

public class MoreOlderCalc {
    private final String name;
    private final int age;

    public MoreOlderCalc(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
