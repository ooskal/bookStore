package bookStore.bookStore.entity.book;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Book {
    private int bookNum;
    private String title;
    private int price;


}
