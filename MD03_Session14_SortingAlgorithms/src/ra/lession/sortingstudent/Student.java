package ra.lession.sortingstudent;

public class Student {
    private int studentId;
    static int count=100;
    private String name;
    private double score;

    public Student() {
        this.studentId=Student.count++;
    }

    public Student( String name, double score) {
        this.studentId = Student.count++;
        this.name = name;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
