package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String MainPage(@ModelAttribute("newUser") User user,
                           @ModelAttribute("editUser") User editUser,
                           Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.create(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("userId") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("editUser") User editUser) {
        userService.updateUser(editUser);
        return "redirect:/";
    }

}