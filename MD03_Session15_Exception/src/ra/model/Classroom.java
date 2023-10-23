package ra.model;

public class Classroom {
    private int classroomId;
    private static int id=1;
    private String classroomName;
    private boolean status;

    public Classroom() {
        this.classroomId=Classroom.id++;
    }

    public Classroom( String classroomName, boolean status) {
        this.classroomId = Classroom.id++;
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
}
