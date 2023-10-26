package demowritereadfile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Classroom> classroomList = new ArrayList<>();

//        classroomList.add(new Classroom("Java", true));
//        classroomList.add(new Classroom("Python", true));
//        classroomList.add(new Classroom("JS", true));

        WriteReadFile writeReadFile = new WriteReadFile();
//        writeReadFile.writeFile(WriteReadFile.PATH_CLASSROOM, classroomList);

        classroomList = writeReadFile.readFile(WriteReadFile.PATH_CLASSROOM);
        for (Classroom classroom : classroomList) {
            System.out.println(classroom);
        }
    }
}
