package net.suncaper.mallanli.service;

import com.github.pagehelper.PageInfo;
import net.suncaper.mallanli.common.domain.Book;

import java.util.List;

public interface BookService {
    //增删改查
    int addBook(Book book);
    int addBooks(List<Book> books);
    int removeBookById(Integer... id);
    int modifyBook(Book book);

    Book findBookById(Book book);

    PageInfo<Book> findBook(int page,int limit);


}
