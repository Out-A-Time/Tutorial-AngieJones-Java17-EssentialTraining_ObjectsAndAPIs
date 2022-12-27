package inheritance.shapes;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter is " + sides * length);
        return sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
