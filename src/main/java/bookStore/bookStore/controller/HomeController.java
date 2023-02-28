package bookStore.bookStore.controller;

import bookStore.bookStore.entity.book.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name","gfd");
        return "index";

    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/myPage")
    public String mypage() {
        return "myPage";
    }


}
