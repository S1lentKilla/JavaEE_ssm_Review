package com.haust.mapper;

import com.haust.pojo.Book;
import org.apache.ibatis.annotations.Select;

public interface BookMapper {
    @Select("select * from tb_book where id=#{id}")
    Book getBookById(int id);
}
