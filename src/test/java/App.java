import cn.yukismimi.entity.Book;
import cn.yukismimi.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-mybatis.xml")
public class App {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void findBookById(){
        System.out.println(bookMapper.findBookById(0));
    }

    @Test
    public void findBookList() {
        bookMapper.findBookList()
                .stream()
                .forEach(System.out::println);
    }

    @Test
    public void addBook(){
        Book book = new Book();
        book.setAuthor("ジョジョの奇妙な冒険");
        book.setBookName("荒木飛呂彦");
        book.setOtherInfo("スタープラチナ　ザ　ワールド！！！");
        book.setPress("集英社");
        book.setPrice(650);
        book.setStock(999);
        book.setOnSellStatus(1);
        bookMapper.addBook(book);
    }


}
