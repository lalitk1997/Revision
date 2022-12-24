package io.project.JUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;
    
}
