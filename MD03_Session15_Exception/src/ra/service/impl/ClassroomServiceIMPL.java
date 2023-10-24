package ra.service.impl;

import ra.model.Classroom;
import ra.service.IClassroomService;

import java.util.ArrayList;
import java.util.List;

public class ClassroomServiceIMPL implements IClassroomService {
    public static List<Classroom> classroomList = new ArrayList<>();

    @Override
    public List<Classroom> findAll() {
        return classroomList;
    }

    @Override
    public void save(Classroom classroom) {
        classroomList.add((classroom));
    }

    @Override
    public void update(Classroom classroom) {
        Classroom classroomEdit = findById(classroom.getClassroomId());
        classroomEdit.setClassroomName(classroom.getClassroomName());
        classroomEdit.setStatus(classroom.isStatus());
    }

    @Override
    public void deleteByIt(int id) {
        Classroom classroomDelete=findById(id);
        classroomList.remove(classroomDelete);
    }

    @Override
    public Classroom findById(int id) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomId() == id) {
                return classroom;
            }
        }
        return null;
    }
}
