package net.suncaper.mallanli.mapper.extend;

import net.suncaper.mallanli.common.domain.Book;
import net.suncaper.mallanli.common.domain.BookExample;
import net.suncaper.mallanli.mapper.BookMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapperExtend extends BookMapper {
    int insertBatch(@Param("books") List<Book> bookList);
}