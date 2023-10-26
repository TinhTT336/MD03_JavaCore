package demowritereadfile;

import java.io.*;
import java.util.List;

public class WriteReadFile {

    public  static final String PATH_CLASSROOM="src/ra/demowritereadfile/classroom.dat";
    public void writeFile(String PATH_FILE, List<Classroom> classroomList){
        File file = new File(PATH_FILE);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(classroomList);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println("Write Error!");;
        }

    }
    public List<Classroom> readFile(String PATH_FIlE){
        File file=new File(PATH_FIlE);
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        List<Classroom>classroomList=null;

        try {
            fis=new FileInputStream(file);
            ois= new ObjectInputStream(fis);
            classroomList= (List<Classroom>) ois.readObject();
            fis.close();
            ois.close();;
        } catch(FileNotFoundException e){
            System.out.println("Khong co file");
        } catch (IOException e) {
            System.out.println("File rong!");;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return classroomList;
    }
}
