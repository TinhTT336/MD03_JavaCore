package ra.service.impl;

import ra.config.WriteReadFile;
import ra.model.Subject;
import ra.service.ISubjectService;

import java.util.ArrayList;
import java.util.List;

public class SubjectServiceIMPL implements ISubjectService {
    static List<Subject> subjectList;
    static WriteReadFile<List<Subject>> subjectWriteReadFile = new WriteReadFile<>();

    static {
        subjectList = subjectWriteReadFile.readFile(WriteReadFile.PATH_SUBJECT);
        subjectList = (subjectList == null) ? new ArrayList<>() : subjectList;
    }

    @Override
    public List<Subject> findAll() {
        return subjectList;
    }

    @Override
    public void save(Subject subject) {
        subjectList.add(subject);
        updataData();
    }

    @Override
    public void update(Subject subject) {
        Subject subjectEdit = findById(subject.getSubjectId());
        subjectEdit.setSubjectName(subject.getSubjectName());
        updataData();
    }

    @Override
    public void deleteByIt(int id) {
        Subject subjectDelete = findById(id);
        subjectList.remove(subjectDelete);
        updataData();
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

    @Override
    public void updataData() {
        subjectWriteReadFile.writeFile(WriteReadFile.PATH_SUBJECT,subjectList);
    }
}
