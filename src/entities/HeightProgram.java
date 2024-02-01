package entities;

public class HeightProgram {

    private final String name;
    private final int age;
    private final double height;

    public HeightProgram(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
