package lession.lession3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DuplicateWord {
    public static void main(String[] args) throws IOException {
        //B1: tạo file và cho sẵn dữ liệu(có thêt coppy đề bài cho vào file)
        //B2: viết hàm đọc file.
        //B3: convert file đọc được thành mảng string với mỗi từ là 1 phần tử
        //B4: sử dụng vòng lặp để tìm kiếm các phần tử xuất hiện nhiều hơn 1 lần và add những phần tử đó vào 1 list
        //B5: hiển thị kết quả.

        File file = new File("src/lession/lession3/string3.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Viết chương trình đọc nội dung từ file đọc text và hiển thị đọc các từ trùng lặp trong file đó");
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str = bufferedReader.readLine();
        String[] words = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            if (list.contains(words[i])) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        System.out.println("List cac tu xuat hien nhieu hon 1 lan trong file: " + list);
    }
}
