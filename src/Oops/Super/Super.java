package Oops.Super;

public class Super {
    public static void main(String[] args) {

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("San", "Diago", 50000);

        person.showName();
        student.showName();
        System.out.println(student.gpa);

        student.showGPA();

        employee.showSalary();
    }
}
