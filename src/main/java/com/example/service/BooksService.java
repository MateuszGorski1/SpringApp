package com.example.service;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.BooksRepository;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks()
    {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(book -> books.add(book));
        return books;
    }

    public Books getBookById(int id)
    {
        return booksRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    public void saveOrUpdate(Books books)
    {
        booksRepository.save(books);
    }

    public void delete(int id)
    {
        if(booksRepository.findById(id).isEmpty()){
            throw new BookNotFoundException(id);
        }
        booksRepository.deleteById(id);
    }

}
