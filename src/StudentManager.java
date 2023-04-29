import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentInt {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1,"Sheker",19));
        students.add(new Student(2,"Almaz",20));
        students.add(new Student(3,"Serxan",21));
        students.add(new Student(4,"Resul",22));
    }
    @Override
    public Student getById(int id) {
        return students.get(id-1);
    }

    @Override
    public void SaveStudent(Student student) {
        students.add(student);

    }

    @Override
    public List<Student> getaAll() {
        return students;
    }
}
