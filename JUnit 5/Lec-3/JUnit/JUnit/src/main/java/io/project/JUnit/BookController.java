package io.project.JUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController(value = "/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @GetMapping
    public List<Book> getAllBookRecords(){
        return bookRepository.findAll();
    }
    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable Long bookId){
        return bookRepository.findById(bookId).get();
    }
    @PostMapping
    public Book createBookRecord(@RequestBody @Valid Book bookRecord){
        return bookRepository.save(bookRecord);
    }
    @PutMapping
    public Book updateBookRecord(@RequestBody @Valid Book bookRecord) throws Exception {
        if(bookRecord == null || bookRecord.getBookId() == null){
            throw new Exception("Provide valid details");
        }
        Optional<Book> optionalBook = bookRepository.findById(bookRecord.getBookId());
        if(optionalBook.isEmpty()){
            throw new Exception("Book Not Found");
        }
        Book existingBookRecord = optionalBook.get();
        existingBookRecord.setName(bookRecord.getName());
        existingBookRecord.setSummary(bookRecord.getSummary());
        existingBookRecord.setRating(bookRecord.getRating());
        return bookRepository.save(existingBookRecord);
    }
}
