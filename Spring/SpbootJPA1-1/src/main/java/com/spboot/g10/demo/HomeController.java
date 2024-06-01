package com.spboot.g10.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spboot.g10.demo.service.UserService;

@Controller
public class HomeController {

	@Autowired
    private UserService userService;
	
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot with JSP!");
        return "index";
    }
    @GetMapping("/a")
    public String pageA(Model model) {
        model.addAttribute("message", "hear is page A");
        return "index";
    }
    
    @GetMapping("/user")
    public String showUserForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm"; // userForm.jsp를 의미합니다.
    }

    @PostMapping("/user")
    public String submitUserForm(@ModelAttribute User user, Model model) {
        User savedUser = userService.saveUser(user);
        model.addAttribute("message", "User saved successfully with ID: " + savedUser.getId());
        return "userForm"; // userForm.jsp를 의미합니다.
    }
    
    @GetMapping("/box")
    public String boxPage(Model model) {
    	return "box";
    }
}
