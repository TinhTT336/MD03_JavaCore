package ra.model;

import ra.service.impl.ClassroomServiceIMPL;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static ra.service.impl.ClassroomServiceIMPL.classroomList;

public class Classroom extends Entity implements Serializable {
    private int classroomId;
    private String classroomName;
    private boolean status;

    public Classroom() {
        this.classroomId = getIdMax(classroomList) + 1;
//        this.classroomId = (classroomList.get(classroomList.size() - 1).getClassroomId()) + 1;
        this.classroomId = (classroomList.isEmpty()) ? 1 : this.getClassroomId();
    }

    public Classroom(String classroomName, boolean status) {
        this.classroomId = getIdMax(classroomList) + 1;
//        this.classroomId = (classroomList.get(classroomList.size() - 1).getClassroomId()) + 1;
        this.classroomId = (classroomList.isEmpty()) ? 1 : this.getClassroomId();
        this.classroomName = classroomName;
        this.status = status;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }


    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", classroomName='" + classroomName + '\'' +
                ", status=" + status +
                '}';
    }

    public int getIdMax(List<Classroom> classroomList) {
        int maxId = 0;
        for (Classroom classroom : classroomList) {
            if (maxId <  classroom.getClassroomId()) {
                maxId = classroom.getClassroomId();
            }
        }
        return maxId;
    }
}
