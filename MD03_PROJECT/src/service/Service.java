package service;

import model.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Service<T extends Entity, ID extends Number> {
    private String fileName;

    public Service(String fileName) {
        this.fileName = fileName;
        File file = new File(fileName);
        file.getParentFile().mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Tạo file sau đây bị lỗi: " + fileName);
        }
    }

    public List<T> findAll() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<T> list = (List<T>) ois.readObject();
            ois.close();
            return list;
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            return new ArrayList<>();
        }
    }

    public int getNewId() {
        List<T> list = findAll();
        int maxId = (list.isEmpty()) ? 0 : (int) list.get(list.size() - 1).getId();
        return maxId + 1;
    }

    public boolean save(T t) {
        List<T> list = findAll();
        for (T e : list) {
            if (t.getId().equals(e.getId())) {
                int index = list.indexOf(t);
                list.set(index, e);
                return saveToFile(list, this.fileName);
            }
        }
        list.add(t);
        return saveToFile(list, this.fileName);
    }

    public T findById(ID id) {
        List<T> list = findAll();
        for (T t : list) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public boolean deleteById(ID id) {
        List<T> list = findAll();
        T t = findById(id);
        if (t == null) {
            return false;
        } else {
            list.remove(t);
            return saveToFile(list, this.fileName);
        }
    }

    public boolean saveOnlyOne(T t) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(t);
            outputStream.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    protected boolean saveToFile(List<T> list, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
