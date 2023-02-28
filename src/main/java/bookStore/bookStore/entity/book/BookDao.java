package bookStore.bookStore.entity.book;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    public List<Book> listBook();
}
