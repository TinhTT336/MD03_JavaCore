package ra.service.impl;

import ra.config.WriteReadFile;
import ra.model.Mark;
import ra.service.IMarkService;

import java.util.ArrayList;
import java.util.List;

public class MarkServiceIMPL implements IMarkService {
    static List<Mark> markList;

    static WriteReadFile<List<Mark>> markWriteReadFile = new WriteReadFile<>();

    static {
        markList = markWriteReadFile.readFile(WriteReadFile.PATH_MARK);
        markList = (markList == null) ? new ArrayList<>() : markList;
    }

    @Override
    public List<Mark> findAll() {
        return markList;
    }

    @Override
    public void save(Mark mark) {
        markList.add(mark);
        updataData();
    }

    @Override
    public void update(Mark mark) {
        Mark markEdit = findById(mark.getMarkId());
        markEdit.setStudent(mark.getStudent());
        markEdit.setSubject(mark.getSubject());
        markEdit.setPoint(mark.getPoint());
        updataData();
    }

    @Override
    public void deleteByIt(int id) {
        Mark mark = findById(id);
        markList.remove(mark);
        updataData();
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

    @Override
    public void updataData() {
        markWriteReadFile.writeFile(WriteReadFile.PATH_MARK, markList);

    }
}
