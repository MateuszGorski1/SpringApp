package com.example.service;

class BookNotFoundException extends RuntimeException  {

    BookNotFoundException(int id) {
        super("Could not find book, id: " + id);
    }
}