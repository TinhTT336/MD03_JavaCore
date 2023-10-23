package lession.lession4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAlphabet {
    public static void main(String[] args) throws IOException {
        //Đề bài: Viết chương trình đọc nội dung từ file text và sắp xếp các từ trong file theo thứ tự bảng chữ cái.

        File file = new File("src/lession/lession4/string4.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Viết chương trình đọc nội dung từ file text và sắp xếp các từ trong file theo thứ tự bảng chữ cái");
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        String[] strArr = str.split(" ");
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
