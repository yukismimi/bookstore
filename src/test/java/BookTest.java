import cn.yukismimi.entity.Book;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Comparator;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-mybatis.xml")
public class BookTest {
    @Autowired
    private BookMapper bookMapper;

    @Autowired
    BookService bookService;

    @Test
    public void findBook(){
        Book book = new Book();
        book.setPress("集英社");
        bookMapper.findBook(book)
                .forEach(System.out::println);
    }

    @Test
    public void findBookById(){
        Book book = bookMapper.findBookById(1);
        Assert.assertEquals(1,book.getId(),0);
    }

    @Test
    public void findBookList() {
        bookService.findBookList()
            .forEach(System.out::println);
        /*bookMapper.findBookList()
                .forEach(System.out::println);*/
    }

    @Test
    public void addBook(){
        int id = bookMapper.findBookList()
                .stream()
                .map(Book::getId)
                .max(Integer::compareTo)
                .orElse(0);

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

    @Test
    public void modifyBook(){
        Book before = bookMapper.findBookById(1);
        double newPrice = before.getPrice()+0.1;
        before.setPrice(newPrice);
        bookMapper.modifyBook(before);
        Book after = bookMapper.findBookById(1);
        Assert.assertEquals(newPrice,after.getPrice(),10e-5);
    }

    @Test
    public void removeById(){
        int id = bookMapper.findBookList()
                .stream()
                .map(Book::getId)
                .max(Integer::compareTo)
                .orElse(0);
        if(id != 0){
            bookMapper.removeBookById(id);
            Assert.assertNull(bookMapper.findBookById(id));
        }
    }

}
