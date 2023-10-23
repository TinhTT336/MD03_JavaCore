package ra.service.impl;

import ra.model.Subject;
import ra.service.ISubjectService;

import java.util.ArrayList;
import java.util.List;

public class SubjectServiceIMPL implements ISubjectService {
    static List<Subject>subjectList=new ArrayList<>();
    @Override
    public List<Subject> findAll() {
        return subjectList;
    }

    @Override
    public void save(Subject subject) {

    }

    @Override
    public void update(Subject subject) {

    }

    @Override
    public void deleteByIt(int id) {

    }

    @Override
    public Subject findById(int id) {
        return null;
    }
}
