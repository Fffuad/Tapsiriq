import java.util.List;

public interface StudentInt {
    Student getById(int id);
    void SaveStudent(Student student);
    List<Student>getaAll();
}
