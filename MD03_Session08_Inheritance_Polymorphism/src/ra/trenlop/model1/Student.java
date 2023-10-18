package ra.trenlop.model1;

public class Student extends User{
    private String subject;

    public Student() {
    }

    public Student(String subject) {
        this.subject = subject;
    }

    public Student(String name, String password, String subject) {
        super(name, password);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }


@Override
    public void displayData(){
        super.displayData();
        System.out.println("Mon hoc: "+getSubject());
    }


}
