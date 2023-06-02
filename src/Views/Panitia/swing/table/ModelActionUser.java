package Views.Panitia.swing.table;

import Views.Panitia.model.ModelUser;

public class ModelActionUser {

    public ModelUser getUser() {
        return user;
    }

    public void setUser(ModelUser user) {
        this.user = user;
    }

    public EventActionUser getEvent() {
        return event;
    }

    public void setEvent(EventActionUser event) {
        this.event = event;
    }

    public ModelActionUser(ModelUser user, EventActionUser event) {
        this.user = user;
        this.event = event;
    }

    public ModelActionUser() {
    }

    private ModelUser user;
    private EventActionUser event;
}
