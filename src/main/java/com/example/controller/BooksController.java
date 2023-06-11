package com.example.controller;
import java.util.List;

import com.example.model.Books;
import com.example.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "test.spring")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/books")
    private List<Books> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid)
    {
        return booksService.getBookById(bookid);
    }

    @DeleteMapping("/book/{bookid}")
    private ResponseEntity deleteBook(@PathVariable("bookid") int bookid)
    {
        booksService.delete(bookid);
        return ResponseEntity.ok("Successfully deleted book, id: " + bookid);
    }

    @PostMapping("/book")
    private ResponseEntity saveBook(@RequestBody Books books)
    {
        booksService.saveOrUpdate(books);
        return ResponseEntity.ok("Successfully added book, id: " + books.getBookid());
    }

    @PutMapping("/book")
    private ResponseEntity update(@RequestBody Books books)
    {
        booksService.saveOrUpdate(books);
        return ResponseEntity.ok("Successfully edited book, id: " + books.getBookid());
    }
}
