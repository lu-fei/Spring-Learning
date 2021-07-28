package com.yr.service;

import com.yr.dao.BooksMapper;
import com.yr.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BooksMapper booksMapper;

    public void setBookMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
