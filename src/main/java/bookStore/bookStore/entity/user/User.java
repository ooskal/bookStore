package bookStore.bookStore.entity.user;

import lombok.Data;
import lombok.Getter;


@Getter
@Data
public class User {

    private int userNum;
    private String id;
    private String name;
    private String pw;

}
