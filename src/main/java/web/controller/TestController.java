package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @GetMapping(value = "/")
    public String printWelcome(Model model) {
        List<String> messages = new ArrayList<>();
        messages.add("Test Message!");
        model.addAttribute("messages", messages);
        return "index";
    }

}