package com.kwon.ji.eun.KwonSpringboot.rest;

import com.kwon.ji.eun.KwonSpringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", "hello! world!!");
        return "index";
    }

}
