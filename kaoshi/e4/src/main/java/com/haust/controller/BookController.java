package com.haust.controller;


import com.haust.pojo.Book;
import com.haust.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/main")
    public String main() {
        return "main.jsp";
    }

    @PostMapping("/show")
    public String show(@RequestParam int id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("id",book.getId());
        model.addAttribute("name",book.getName());
        model.addAttribute("press",book.getPress());
        model.addAttribute("author",book.getAuthor());
        return "show.jsp";
    }

}
