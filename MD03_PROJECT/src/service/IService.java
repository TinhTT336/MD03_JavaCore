package service;

import java.util.List;

public interface IService<T,ID> {
    public List<T> findAll();
    public int getNewId();
    public boolean save(T t);
    public T findById(ID id);
    public boolean deleteById(ID id);
    public boolean saveToFile(List<T> list, String fileName);
}
