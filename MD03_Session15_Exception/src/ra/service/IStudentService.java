package ra.service;

import ra.model.Student;

import java.util.List;

public interface IStudentService extends IGeneric<Student> {
    List<Student>findByName(String name);


}
