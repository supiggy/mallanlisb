package net.suncaper.mallanli.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.suncaper.mallanli.common.domain.Book;
import net.suncaper.mallanli.common.domain.BookExample;
import net.suncaper.mallanli.mapper.extend.BookMapperExtend;
import net.suncaper.mallanli.mapper.extend.ImgFileMapperExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapperExtend bookMapper;


    @Override
    public int addBook(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int addBooks(List<Book> books) {
        return bookMapper.insertBatch(books);
    }

    @Override
    public int removeBookById(Integer... id) {
        BookExample example = new BookExample();
        example.createCriteria().andIdIn(Arrays.asList(id));
        return bookMapper.deleteByExample(example);
    }

    @Override
    public int modifyBook(Book book) {
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public Book findBookById(Book book) {
        return bookMapper.selectByPrimaryKey(book.getId());
    }



    @Override
    public PageInfo<Book> findBook(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<Book> books = bookMapper.selectByExample(null);
        PageInfo<Book> pageInfo = new PageInfo<>(books);
        return pageInfo;
    }
}
