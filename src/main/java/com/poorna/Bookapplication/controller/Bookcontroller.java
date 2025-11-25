package com.poorna.Bookapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poorna.Bookapplication.entity.Book;
import com.poorna.Bookapplication.service.Bookservice;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/books/v1")
public class Bookcontroller {

    private Bookservice bookservice;
    public Bookcontroller(Bookservice bookservice) {
        this.bookservice = bookservice;
    }
    @GetMapping("/getbook")
    public Optional<Book> getBookById(@RequestParam Integer id) {
        return bookservice.getBookById(id);
    }
    
    
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book b=bookservice.addBook(book);
        return ResponseEntity.ok(b);
        
    }
    
}
    

