package Views.Panitia.model;

public class ModelCard1 {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getButtonTitle() {
        return buttonTitle;
    }

    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }

    public ModelCard1(String title, String buttonTitle) {
        this.title = title;
        this.buttonTitle = buttonTitle;
    }

    public ModelCard1() {
    }

    private String title;
    private String buttonTitle;

}
