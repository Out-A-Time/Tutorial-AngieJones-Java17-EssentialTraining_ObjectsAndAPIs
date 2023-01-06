package inheritance.vehicles;

public class Garage {

    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("red");

        System.out.println(
                String.format("My car is %s and has %d doors.",
                        myCar.getColor(), myCar.getDoors())
        // My car is red and has 2 doors.
        );
    }
}