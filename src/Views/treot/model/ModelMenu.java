package Views.treot.model;

import javax.swing.Icon;

public class ModelMenu {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String[] getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String[] subMenu) {
        this.subMenu = subMenu;
    }

    public ModelMenu(String menuName, String... subMenu) {
        this.menuName = menuName;
        this.subMenu = subMenu;
    }

    public ModelMenu() {
    }

    private String id;
    private String menuName;
    private String subMenu[];
}
