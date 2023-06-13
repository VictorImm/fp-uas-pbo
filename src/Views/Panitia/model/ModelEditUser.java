package Views.Panitia.model;

import Views.Panitia.swing.table.EventActionUser;
import Views.Panitia.swing.table.ModelActionUser;

public class ModelUser {

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModelUser(int no, String name, String email, String status) {
        this.no = no;
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public ModelUser() {
    }

    private int no;
    private String name;
    private String email;
    private String status;

    public Object[] toRowTable(EventActionUser event) {
        return new Object[]{no, name, email, status, new ModelActionUser(this, event)};
    }
}
