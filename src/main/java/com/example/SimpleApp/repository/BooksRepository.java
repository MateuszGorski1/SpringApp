package com.example.SimpleApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SimpleApp.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>
{
}