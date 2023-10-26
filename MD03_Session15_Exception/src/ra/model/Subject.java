package ra.model;

import java.io.Serializable;

public class Subject implements Serializable {
    private int subjectId;
    private static int count=1;
    private String subjectName;

    public Subject() {
        this.subjectId=Subject.count++;
    }

    public Subject( String subjectName) {
        this.subjectId = Subject.count++;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
