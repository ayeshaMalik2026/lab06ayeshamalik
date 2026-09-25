package lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractionTest {

    public static void main(String[] args) {

        List<String> students;

        students = new ArrayList<>();
        students.add("Ali");

        System.out.println("ArrayList: " + students);

        students = new LinkedList<>();
        students.add("Ahmed");

        System.out.println("LinkedList: " + students);
    }
}
