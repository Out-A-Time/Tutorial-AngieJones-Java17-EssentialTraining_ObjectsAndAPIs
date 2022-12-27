package inheritance.people;

public class InheritanceChecker {

    public static void main(String[] args) {
        Person person = new Person();
        // We are getting access to fields from class People through 'setters' and
        // 'getters'
        person.getName();
        person.setAge(27);
        person.setGender("male");

        Employee employee = new Employee();
        // We are getting access to same fields from class Person,
        // and from Employee because inheritance
        employee.setName("John");
        employee.getEmployeeId();
        employee.setTitle("Software Engineer");
    }
}
