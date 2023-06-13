package Views.Panitia.model;

//import Views.Panitia.swing.table.EventActionUser;
//import Views.Panitia.swing.table.ModelActionUser;

public class ModelEditUser {

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

    public ModelEditUser(int no) {
        this.no = no;
    }

    public ModelEditUser() {
    }

    private int no;
    private String name;
    private String email;

//    public Object[] toRowTable(EventActionUser event) {
//        return new Object[]{no, name, email, status, new ModelActionUser(this, event)};
//    }
}
