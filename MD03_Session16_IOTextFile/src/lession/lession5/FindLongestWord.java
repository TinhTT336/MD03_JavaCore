package lession.lession5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) throws IOException {
//        B1: đọc file thành String.
//B2: convert thành mảng string với mỗi từ là 1 phần tử.
//B3: tạo 1 list string để lưu các từ tìm được.
//B4: duyệt mảng tìm length lớn nhất, nếu leng của phần tử = leng lớn nhất thì add vào list, nếu lớn hơn length lớn nhất thì đổi list list mới và gán lại.
//B5: tạo vòng lặp in ra các từ có độ dài lớn nhất, và độ dài của chúng.

        File file=new File("src/lession/lession5/string5.txt");
        file.createNewFile();

        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Bài tập tìm và hiển thị các từ có độ dài lớn nhất");
        fileWriter.close();

        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str=bufferedReader.readLine();

        String[]strArr=str.split(" ");

        List<String> list=new ArrayList<>();
        int maxLength=0;
        for(String s:strArr){
            if(maxLength<s.length()){
                maxLength=s.length();
            }
        }
        for(String s:strArr){
            if(s.length()==maxLength){
                list.add(s);
            }
        }
        System.out.println("Cac tu co do dai lon nhat trong file la: "+list+" voi do dai "+maxLength);
    }
}
