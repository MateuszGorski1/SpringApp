package com.example.model;
import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Books {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="book_id")
        private int book_id;

        @Column(name="bookname")
        private String bookname;

        @Column(name="author")
        private String author;

        @Column(name="price")
        private int price;

        public int getBookid()
        {
            return book_id;
        }
        public void setBookid(int bookid)
        {
            this.book_id = bookid;
        }
        public String getBookname()
        {
            return bookname;
        }
        public void setBookname(String bookname)
        {
            this.bookname = bookname;
        }
        public String getAuthor()
        {
            return author;
        }
        public void setAuthor(String author)
        {
            this.author = author;
        }
        public int getPrice()
        {
            return price;
        }
        public void setPrice(int price)
        {
            this.price = price;
        }
}

