package ra.repo;

import ra.model.Classroom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository implements IFileReposityory<Classroom, Integer> {
    private final File file;

    public ClassroomRepository() {
        File dataDir = new File("data");
        dataDir.mkdir();
        file = new File("data/classroom.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Co loi xay ra khi tao moi file classroom");
        }
    }

    @Override
    public List<Classroom> findAll() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Classroom> classrooms = (List<Classroom>) ois.readObject();
            ois.close();
            return classrooms;
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public boolean save(Classroom e) {
        List<Classroom> classrooms = findAll();
        for (Classroom classroom : classrooms) {
            if (classroom.getClassroomId() == e.getClassroomId()) {
                int index = classrooms.indexOf(classroom);
                classrooms.set(index, e);
                return saveToFile(classrooms, this.file);
            }
        }
        classrooms.add(e);
        return saveToFile(classrooms,this.file);
    }

    @Override
    public Classroom findById(Integer id) {
        List<Classroom> classrooms = findAll();
        for (Classroom classroom : classrooms) {
            if (classroom.getClassroomId() == id) {
                return classroom;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        List<Classroom> classrooms = findAll();
        for (Classroom classroom : classrooms) {
            if (classroom.getClassroomId() == id) {
                classrooms.remove(classroom);
                return true;
            }
        }
        return false;
    }

}
