import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    private String name="arjon";
    private String userName="arjon123";
    private int id=123;

    public UserInfo(int id,String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
