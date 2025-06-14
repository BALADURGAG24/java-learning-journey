package Oops.Constructor;

public class Constructor {
    public static void main(String[] args){

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("patrick", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
