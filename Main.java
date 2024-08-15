import java.time.LocalDate;
import java.util.Date;
import java.util.*;

public class Main {
    public List printUserInfo(UserInfo uI){
     return List.of(uI.getName(),uI.getUserName(),uI.getId());
    }
    public static void main(String[] args) {
        UserInfo uI=new UserInfo(123,"ahmad","ahmad123");
        System.out.println(main.printUserInfo(uI));

    }
}
