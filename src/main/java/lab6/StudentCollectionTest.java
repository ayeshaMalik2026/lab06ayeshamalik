package lab6;

public class StudentCollectionTest {

    public static void main(String[] args) {

        StudentCollection collection =
                new StudentCollectionImplementation();

        Student student1 =
                new Student(1, "Ali", 3.5);

        Student student2 =
                new Student(2, "Ahmed", 3.7);

        // Add students
        collection.addStudent(student1);
        collection.addStudent(student2);

        System.out.println("Students added.");
        System.out.println("Total students: "
                + collection.getSize());

        // Find student
        Student found = collection.findStudent(1);

        if (found != null) {
            System.out.println("Student found: "
                    + found.getName());
        }

        // Remove student
        collection.removeStudent(2);

        System.out.println("After removing student 2:");
        System.out.println("Total students: "
                + collection.getSize());

        // Check empty
        System.out.println("Is collection empty? "
                + collection.isEmpty());
    }
}
