package ra.service.impl;

import ra.config.WriteReadFile;
import ra.model.Classroom;
import ra.service.IClassroomService;

import java.util.ArrayList;
import java.util.List;

public class ClassroomServiceIMPL implements IClassroomService {
    public static List<Classroom> classroomList;
    static WriteReadFile<Classroom> classroomWriteReadFile = new WriteReadFile<>();

    static {
        classroomList = classroomWriteReadFile.readFile(WriteReadFile.PATH_CLASSROOM);
        classroomList = (classroomList == null) ? new ArrayList<>() : classroomList;
    }


    @Override
    public List<Classroom> findAll() {
        return classroomList;
    }

    @Override
    public void save(Classroom classroom) {
        classroomList.add((classroom));
        updataData();
    }

    @Override
    public void update(Classroom classroom) {
        Classroom classroomEdit = findById(classroom.getClassroomId());
        classroomEdit.setClassroomName(classroom.getClassroomName());
        classroomEdit.setStatus(classroom.isStatus());
        updataData();
    }

    @Override
    public void deleteByIt(int id) {
        Classroom classroomDelete = findById(id);
        classroomList.remove(classroomDelete);
        updataData();
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

    @Override
    public void updataData() {
        classroomWriteReadFile.writeFile(WriteReadFile.PATH_CLASSROOM, classroomList);

    }
}
