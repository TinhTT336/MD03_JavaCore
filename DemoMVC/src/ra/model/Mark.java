package ra.model;

public class Mark {
    private int markId;
    private static int count=10;
    private Student student;
    private Subject subject;
    private double point;

    public Mark() {
        this.markId=Mark.count++;
    }

    public Mark( Student student, Subject subject, double point) {
        this.markId = Mark.count++;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "markId=" + markId +
                ", student=" + student +
                ", subject=" + subject +
                ", point=" + point +
                '}';
    }
}
