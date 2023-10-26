package model.category;

import model.Entity;

import java.io.Serializable;
import java.util.List;

public class Category extends Entity {
    private static final long serialVersionUID = 1L;
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
