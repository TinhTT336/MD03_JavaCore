package TrenLop;

public class MainStudent {
    public static void main(String[] args) {
        Student student=new Student("A",27,true); //khoi tao 1 doi tuong

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.address);

        System.out.println(student.getName());

        student.displayBasicInfo();
        System.out.println(student.toString());
//        System.out.println(student); // khi goi student mac dinh la goi toi student.toString()
        //toString() la phuong thuc co san cua Object, muon hien thi theo yeu cau thi tao phuong thuc toString() de ghi de (override)
    }
}
