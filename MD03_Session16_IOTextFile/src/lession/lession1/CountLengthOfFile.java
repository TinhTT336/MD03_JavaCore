package lession.lession1;

import java.io.*;

public class CountLengthOfFile {
    public static void main(String[] args) throws IOException {
        //B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)
        //B2: Tạo hàm đọc file trên và trả ra String.
        //B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử
        //B4: length của mảng trên chính là số lượng từ trong file.

        File textFile = new File("src/lession/lession1/string.text");
        textFile.createNewFile();

        FileWriter fileWriter = new FileWriter(textFile);
        fileWriter.write("Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó");
        fileWriter.close();

        FileReader fileReader = new FileReader(textFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line=bufferedReader.readLine();

        String[]words=line.split(" ");
        System.out.println("So luong tu trong file la: "+words.length);
    }
}
