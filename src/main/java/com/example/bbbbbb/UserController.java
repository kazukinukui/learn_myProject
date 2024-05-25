package com.example.bbbbbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/userForm")
    public String userForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "userForm";
    }

    @PostMapping("/userForm")
    public String userSubmit(@ModelAttribute @Valid UserForm userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "userForm";
        }
        // バリデーションが成功した場合の処理
        return "result";
    }
}
