package ra.config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile<T> {
    public static final String PATH_CLASSROOM = "src/ra/config/data/classroom.txt";
    public static final String PATH_MARK = "src/ra/config/data/mark.txt";
    public static final String PATH_STUDENT = "src/ra/config/data/student.txt";
    public static final String PATH_SUBJECT = "src/ra/config/data/subject.txt";

    public void writeFile(String PATH_NAME, List<T> list) {
        File file = new File(PATH_NAME);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println("WriteFile Error!!!");
        }
    }

    public List<T> readFile(String PATH_NAME) {
        File file = new File(PATH_NAME);
        List<T> list = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<T>) ois.readObject();
            if (fis != null) {
                fis.close();
            }
            if (ois != null) {
                ois.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file !!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Loi doc file !!!");
        } catch (IOException e) {
            System.out.println("File rong");
        }
        return list;
    }
}
