package lession.lession2;

import java.io.*;

public class CountLine {
    public static void main(String[] args) throws IOException {
        File file = new File("src/lession/lession2/string2.text");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Bài tập đếm số dòng trong file");
        bufferedWriter.newLine();
        bufferedWriter.write("Mục tiêu: luyện tâp đọc file.");
        bufferedWriter.newLine();
        bufferedWriter.write("Đề bài: Viết chương trình đọc nội dung từ file text và đếm số dòng trong file đó.");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        int count = 0;
        while ((str=bufferedReader.readLine()) != null) {
            System.out.println(str);
            count++;
        }
        bufferedReader.close();
        System.out.println("So dong cua file la: " + count);


    }
}
