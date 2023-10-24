package ra.service.subject;

import ra.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectServiceIMPL implements ISubjectService{
    List<Subject>subjectList=new ArrayList<>();
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
    public void deleteById(int id) {

    }

    @Override
    public Subject findById(int id) {
        return null;
    }
}
