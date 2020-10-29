package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("Home")
public class HomeController {
    private HomeRepository _homeRepository;

    public HomeController(HomeRepository homeRepository) {
        super();
        this._homeRepository = homeRepository;
    }

    @RequestMapping("/Index")
    public String Index(Model model) {
        Iterable<user> list = _homeRepository.findAll();
        model.addAttribute("users", list);
        return "Index";
    }
}
