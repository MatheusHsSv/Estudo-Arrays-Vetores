package entities;

public class ApprovedStudentsCalc {

    private double grade;
    private double grade2;
    private String name;

    public ApprovedStudentsCalc( String name, double grade,double grade2) {
        this.grade = grade;
        this.name = name;
        this.grade2 = grade2;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade2() {
        return grade2;
    }
}
