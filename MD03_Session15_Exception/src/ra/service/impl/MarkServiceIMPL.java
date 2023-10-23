package ra.service.impl;

import ra.model.Mark;
import ra.service.IMarkService;

import java.util.ArrayList;
import java.util.List;

public class MarkServiceIMPL implements IMarkService {
    static List<Mark>markList=new ArrayList<>();
    @Override
    public List<Mark> findAll() {
        return markList;
    }

    @Override
    public void save(Mark mark) {

    }

    @Override
    public void update(Mark mark) {

    }

    @Override
    public void deleteByIt(int id) {

    }

    @Override
    public Mark findById(int id) {
        return null;
    }
}
