package kg.alatoo.bookstore.controllers;

import kg.alatoo.bookstore.exceptions.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/author/")
public class AuthorController {

    @GetMapping
    public String getAuthor() {
        throw new NotFoundException();
    }
}
