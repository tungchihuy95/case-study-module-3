package model;

import com.sun.org.apache.xpath.internal.operations.String;

public class Contact {
    private int contactId;
    private int name;
    private String email;
    private String object;
    private String content;

    public Contact() {
    }

    public Contact(int contactId, int name, String email, String object, String content) {
        this.contactId = contactId;
        this.name = name;
        this.email = email;
        this.object = object;
        this.content = content;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
