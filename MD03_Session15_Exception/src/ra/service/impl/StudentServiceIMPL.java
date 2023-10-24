package ra.service.impl;

import ra.model.Student;
import ra.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    static List<Student> studentList = new ArrayList<>();

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void update(Student student) {
        Student studentEdit = findById(student.getStudentId());
        studentEdit.setStudentName(student.getStudentName());
        studentEdit.setClassroom(student.getClassroom());
        studentEdit.setBirthday(student.getBirthday());
        studentEdit.setPhone(student.getPhone());
        studentEdit.setGender(student.isGender());
        studentEdit.setAddress(student.getAddress());
    }

    @Override
    public void deleteByIt(int id) {
        Student studentDelete=findById(id);
        studentList.remove(studentDelete);
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
    public void findByName(String name) {
        for(Student student:studentList){
            if(student.getStudentName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(student);
            }
        }
    }
}
