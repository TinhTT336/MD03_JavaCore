package ra.data.lesson.lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "src/ra/data/lesson/lesson2/file.txt";
        String targetFile = "src/ra/data/lesson/lesson2/fileCopy.txt";

        try {
            copyFile(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourceFile, String targetFile) throws IOException {
        // Kiểm tra xem tệp nguồn có tồn tại không
        File file = new File(sourceFile);
        file.createNewFile();
        if (!file.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        // Kiểm tra xem tệp đích đã tồn tại chưa
        File target = new File(targetFile);
        if (target.exists()) {
            System.out.println("Tệp đích đã tồn tại.");
            return;
        }

        // Sao chép nội dung từ tệp nguồn sang tệp đích
        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công. Số byte trong tệp: " + totalBytes);
        }
    }
}
