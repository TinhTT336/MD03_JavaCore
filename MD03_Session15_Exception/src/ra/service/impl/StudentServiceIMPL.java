package ra.service.impl;

import ra.config.WriteReadFile;
import ra.model.Student;
import ra.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    static List<Student> studentList;
    static WriteReadFile<Student> studentWriteReadFile = new WriteReadFile<>();

    static {
        studentList = studentWriteReadFile.readFile(WriteReadFile.PATH_STUDENT);
        studentList = (studentList == null) ? new ArrayList<>() : studentList;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
        updataData();
    }

    @Override
    public void update(Student student) {
        //cach 1
//        Student studentEdit = findById(student.getStudentId());
//        studentEdit.setStudentName(student.getStudentName());
//        studentEdit.setClassroom(student.getClassroom());
//        studentEdit.setBirthday(student.getBirthday());
//        studentEdit.setPhone(student.getPhone());
//        studentEdit.setGender(student.isGender());
//        studentEdit.setAddress(student.getAddress());
//        updataData();

        //cach 2:
        Student studentEdit = findById(student.getStudentId());
        int index = studentList.indexOf(studentEdit);
        studentList.set(index, studentEdit);
        updataData();
    }

    @Override
    public void deleteByIt(int id) {
        Student studentDelete = findById(id);
        studentList.remove(studentDelete);
        updataData();
    }

    @Override
    public Student findById(int id) {
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updataData() {
        studentWriteReadFile.writeFile(WriteReadFile.PATH_STUDENT, studentList);
    }

    @Override
    public void findByName(String name) {
        for (Student student : studentList) {
            if (student.getStudentName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(student);
            }
        }
    }

}
