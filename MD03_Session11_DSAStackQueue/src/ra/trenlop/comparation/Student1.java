package ra.trenlop.comparation;

public class Student1 implements Comparable<Student1> {
    private int id;

    public Student1(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student1 s1) {
      return this.id-s1.id;
    }
}
