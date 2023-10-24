package ra.data.practice;

import java.io.Serializable;

public class Skill implements Serializable {
    private String nameSkill;
    private int yoe;

    public Skill() {
    }

    public Skill(String nameSkill, int yoe) {
        this.nameSkill = nameSkill;
        this.yoe = yoe;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "nameSkill='" + nameSkill + '\'' +
                ", yoe=" + yoe +
                '}';
    }
}
