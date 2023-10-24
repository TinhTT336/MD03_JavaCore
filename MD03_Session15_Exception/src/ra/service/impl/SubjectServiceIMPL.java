package ra.service.impl;

import ra.model.Student;
import ra.model.Subject;
import ra.service.ISubjectService;

import java.util.ArrayList;
import java.util.List;

public class SubjectServiceIMPL implements ISubjectService {
    static List<Subject> subjectList = new ArrayList<>();

    @Override
    public List<Subject> findAll() {
        return subjectList;
    }

    @Override
    public void save(Subject subject) {
        subjectList.add(subject);
    }

    @Override
    public void update(Subject subject) {
        Subject subjectEdit = findById(subject.getSubjectId());
        subjectEdit.setSubjectName(subject.getSubjectName());
    }

    @Override
    public void deleteByIt(int id) {
        Subject subjectDelete = findById(id);
        subjectList.remove(subjectDelete);
    }

    @Override
    public Subject findById(int id) {
        for (Subject subject : subjectList) {
            if (subject.getSubjectId() == id) {
                return subject;
            }
        }
        return null;
    }
}
