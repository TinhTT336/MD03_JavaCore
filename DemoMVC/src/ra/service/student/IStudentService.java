package ra.service.student;

import ra.model.Student;
import ra.service.IGeneric;

import java.util.List;

public interface IStudentService extends IGeneric<Student> {
    List<Student> findByName(String name);
}
