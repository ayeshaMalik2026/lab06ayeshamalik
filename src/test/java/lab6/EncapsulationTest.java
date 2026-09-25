package lab6;

public class EncapsulationTest {

    public static void main(String[] args) {

        Student student = new Student(101, "Ali", 3.5);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student CGPA: " + student.getCgpa());

        // This would produce a compilation error:
        // System.out.println(student.id);
    }
}