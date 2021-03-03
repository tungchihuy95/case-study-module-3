package model;

import com.sun.org.apache.xpath.internal.operations.String;

public class ProductList {
    private int listId;
    private String listName;

    public ProductList() {
    }

    public ProductList(int listId, String listName) {
        this.listId = listId;
        this.listName = listName;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
