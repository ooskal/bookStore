package bookStore.bookStore.dto;

import lombok.Data;

@Data
public class UserDto {

    private int num;
    private String id;
    private String pw;
    private String name;

    public UserDto() {}



    @Override
    public String toString() {
        return "User{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
