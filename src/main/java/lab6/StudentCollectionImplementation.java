package lab6;

import java.util.ArrayList;
import java.util.List;

public class StudentCollectionImplementation
        implements StudentCollection {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int id) {

        Student student = findStudent(id);

        if (student != null) {
            students.remove(student);
        }
    }

    @Override
    public Student findStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}
