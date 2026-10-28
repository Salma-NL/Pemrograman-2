package Modul5.soal1;

public abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}