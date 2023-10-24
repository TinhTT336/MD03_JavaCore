package ra.service.classroom;

import ra.model.Classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomServiceIMPL implements IClassroomService {
    List<Classroom> classroomList = new ArrayList<>();

    @Override
    public List<Classroom> findAll() {
        return classroomList;
    }

    @Override
    public void save(Classroom classroom) {
        classroomList.add(classroom);
    }

    @Override
    public void update(Classroom classroom) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Classroom findById(int id) {
        for(Classroom classroom:classroomList){
            if(classroom.getClassroomId()==id){
                return classroom;
            }
        }
        return null;
    }
}
