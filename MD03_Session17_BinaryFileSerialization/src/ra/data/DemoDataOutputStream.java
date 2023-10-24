package ra.data;

import ra.data.model.Student;

import java.io.*;

public class DemoDataOutputStream {
    public static void main(String[] args) throws IOException {
        File studentFile = new File("dataOutput.dat");
        studentFile.createNewFile();
        Student student = new Student(1, "An", 27, true);
        boolean status = true;
        double PI = 3.14;
        String language = "Java";

        FileOutputStream fos = new FileOutputStream(studentFile);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(language);
        dos.writeDouble(PI);
        dos.writeBoolean(status);
        dos.close();

        FileInputStream fis = new FileInputStream(studentFile);
        DataInputStream dis = new DataInputStream(fis);
        String lang = dis.readUTF();
        double P = dis.readDouble();
        boolean s = dis.readBoolean();
        dis.close();

        System.out.println(lang + " " + P + " " + s);
    }
}
