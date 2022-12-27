package inheritance.shapes;

public class InhertanceChecker {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        square.setSides(2);
        square.setLength(3);
        square.calculatePerimeter();
        square.print("Square");
    }
}
