import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    private String name;
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Grupa nie może mieć ponad 15 osób");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student nie może się powtarzać");
        }
        students.add(student);

            System.out.println(students.get(students.size()-1).fname);

    }

}
