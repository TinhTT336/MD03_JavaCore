package config;

import java.io.*;
import java.util.ArrayList;

public class WriteReadFile <T> {
    public void writeFile(String FILE_NAME, T t){
        File file=new File(FILE_NAME);
        try {
            file.createNewFile();
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(t);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!!!");
        }
    }

    public T readFile(String FILE_NAME){
        File file=new File(FILE_NAME);
        T t = null;
        try{
            file.createNewFile();
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            t= (T) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc file!!!");;
        }
        return t;
    }
}
