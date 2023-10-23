import java.io.File;
import java.io.IOException;

public class FileSubFile {
    public static void main(String[] args) throws IOException {
        File data = new File("data");
        if (data.mkdir()) {
            System.out.println("Tao folder " + data.getName() + " thanh cong!");

            File input = new File("data/input.txt");
            if (input.createNewFile()) {
                System.out.println("Tao file " + input.getName() + " thanh cong!");
            }
            File demo = new File("data/demo.java");
            if (demo.createNewFile()) {
                System.out.println("Tao file " + demo.getName() + " thanh cong!");
            }

            File sub1 = new File("data/sub1");
            if (sub1.mkdir()) {
                System.out.println("Tao folder " + sub1.getName() + " thanh cong!");
                File output = new File("data/sub1/output.txt");
                if (output.createNewFile()) {
                    System.out.println("Tao file " + output.getName() + " thanh cong!");
                }
                File student = new File("data/sub1/student.dat");
                if (student.createNewFile()) {
                    System.out.println("Tao file " + student.getName() + " thanh cong!");
                }
            }
            File sub2 = new File("data/sub2");
            if (sub2.mkdir()) {
                System.out.println("Tao folder " + sub2.getName() + " thanh cong!");
            }
        }

        File[] dataDir = data.listFiles();
        System.out.println(data.getName());
        for (File sub : dataDir) {
            System.out.println("-" + sub.getName());
            if (sub.isDirectory()) {
                File[] subFolder = sub.listFiles();
                for (File file : subFolder) {
                    System.out.println("--" + file.getName());
                }
            }
        }
    }
}
