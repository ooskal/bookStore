package bookStore.bookStore.controller;

import bookStore.bookStore.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/SignUpForm" )
    public String signForm(Model model) {
        model.addAttribute("user", new UserDto());

        return "/SignUpForm";

    }

    @PostMapping( "/SignUpForm" )
    public String createUser(UserDto user, @RequestParam("id") String id) {
        System.out.println(user);
        return "redirect:/";
    }
}
