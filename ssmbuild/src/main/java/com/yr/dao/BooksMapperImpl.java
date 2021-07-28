package com.yr.dao;

import com.yr.pojo.Books;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class BooksMapperImpl implements BooksMapper{
    private SqlSessionTemplate sqlSessionTemplate;
    public void setSqlSessionTemplate(SqlSessionTemplate template){
        this.sqlSessionTemplate = template;
    }


    @Override
    public int addBook(Books book) {
        BooksMapper booksMapper = sqlSessionTemplate.getMapper(BooksMapper.class);
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        BooksMapper booksMapper = sqlSessionTemplate.getMapper(BooksMapper.class);
        return booksMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        BooksMapper booksMapper = sqlSessionTemplate.getMapper(BooksMapper.class);
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        BooksMapper booksMapper = sqlSessionTemplate.getMapper(BooksMapper.class);
        return booksMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        BooksMapper booksMapper = sqlSessionTemplate.getMapper(BooksMapper.class);
        return booksMapper.queryAllBook();
    }
}
