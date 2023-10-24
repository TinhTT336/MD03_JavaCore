package ra.service.impl;

import ra.model.Mark;
import ra.service.IMarkService;

import java.util.ArrayList;
import java.util.List;

public class MarkServiceIMPL implements IMarkService {
    static List<Mark> markList = new ArrayList<>();

    @Override
    public List<Mark> findAll() {
        return markList;
    }

    @Override
    public void save(Mark mark) {
        markList.add(mark);
    }

    @Override
    public void update(Mark mark) {
        Mark markEdit = findById(mark.getMarkId());
        markEdit.setStudent(mark.getStudent());
        markEdit.setSubject(mark.getSubject());
        markEdit.setPoint(mark.getPoint());
    }

    @Override
    public void deleteByIt(int id) {
        Mark mark = findById(id);
        markList.remove(mark);
    }

    @Override
    public Mark findById(int id) {
        for (Mark mark : markList) {
            if (mark.getMarkId() == id) {
                return mark;
            }
        }
        return null;
    }
}
