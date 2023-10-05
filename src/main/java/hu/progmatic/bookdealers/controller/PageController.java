package hu.progmatic.bookdealers.controller;

import hu.progmatic.bookdealers.model.Book;
import hu.progmatic.bookdealers.model.User;
import hu.progmatic.bookdealers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import hu.progmatic.bookdealers.service.BookService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    private final BookService bookService;
    private final UserService userService;

    @Autowired
    public PageController(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    @GetMapping("/home")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/about")
    public String getAboutPage() {
        return "about";
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    @GetMapping("/addBook")
    public String showAddBookForm(Model model) {
        model.addAttribute("newBook", new Book());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("newBook") Book newBook) {
        bookService.addBook(newBook);
        return "redirect:/books";
    }

    @GetMapping("/randomBook")
    public String getRandomBook(Model model) {
        model.addAttribute("randomBook", bookService.getRandomBook());
        return "randomBook";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/addUser")
    public String showAddUserForm(Model model) {
        model.addAttribute("newUser", new User());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("newUser") User newUser) {
        userService.addUser(newUser);
        return "redirect:/users";
    }

    @GetMapping("/randomUser")
    public String getRandomUser(Model model) {
        model.addAttribute("randomUser", userService.getRandomUser());
        return "randomUser";
    }
}
