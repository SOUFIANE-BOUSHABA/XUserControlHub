package org.example.controller;

import org.example.dto.UserDTO;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String listUsers(Model model) {
        List<UserDTO> users = userService.findAll();
        model.addAttribute("users", users);
        return "userList";
    }


    @GetMapping("/new")
    public String createUserForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "userForm";
    }


    @PostMapping
    public String saveUser(@ModelAttribute UserDTO userDTO) {
        userService.save(userDTO);
        return "redirect:/users";
    }


    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        UserDTO user = userService.findById(id);
        model.addAttribute("user", user);
        return "userForm";
    }


    @PostMapping("/update")
    public String updateUser(@ModelAttribute UserDTO userDTO) {
        userService.update(userDTO);
        return "redirect:/users";
    }


    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
