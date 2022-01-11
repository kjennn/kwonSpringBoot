package com.kwon.ji.eun.KwonSpringboot.rest;

import com.kwon.ji.eun.KwonSpringboot.dto.UserDto;
import com.kwon.ji.eun.KwonSpringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final UserService userService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("data", "hello! world!!");

        List<UserDto> userList = new ArrayList<UserDto>();
        userList = userService.findAll();

        model.addAttribute("userList", userList);
        return "index";
    }
}
