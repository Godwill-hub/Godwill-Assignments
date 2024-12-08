package transactionpackage;

import userpackage.user;
import itempackage.item;
public class transaction {
    private String id;
    private user user;
    private item item;

    public transaction (String id, user user, item item) {
        this.id = id;
        this.user = user;
        this.item = item;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
    public item getItem() {
        return item;
    }
    public void setItem(item item) {
        this.item = item;
    }
}
