package com.springboot.thymeleaf.helloworld.controllers;

import com.springboot.thymeleaf.helloworld.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anand Raghunathan on 6/30/18
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showjoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
