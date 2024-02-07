package fi.haagahelia.bookstore.web;


import fi.haagahelia.bookstore.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import java.util.ArrayList;
import java.util.List;



@Controller
public class BookController {



    @GetMapping("/index")
    public String showBooks(Model model){
        System.out.println(("books...."));

        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"The Old Man and the Sea", "Ernest Hemingway", 1952, 978-1-9075-9027-6,18.6));
        books.add(new Book(2,"Romance of the Three Kingdoms", "Luo Guanzhong", 1907, 8951346,36.8));

        model.addAttribute("books",books);
        return "index";
    }


}
