package com.haust.service.impl;

import com.haust.mapper.BookMapper;
import com.haust.pojo.Book;
import com.haust.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getBookById(int id) {
        Book bookById = this.bookMapper.getBookById(id);
        return bookById;
    }
}
