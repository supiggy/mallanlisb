package net.suncaper.mallanli;

import com.github.pagehelper.PageInfo;
import net.suncaper.mallanli.common.domain.Book;
import net.suncaper.mallanli.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
@SpringBootTest
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void addBook() {
    }

    @Test
    public void addBooks() {
    }

    @Test
    public void removeBookById() {
    }

    @Test
    public void modifyBook() {
    }

    @Test
    public void findBookById() {
    }

    @Test
    public void findBook() {
        PageInfo<Book> pageInfo = bookService.findBook(2, 8);
        System.out.println();

    }
}