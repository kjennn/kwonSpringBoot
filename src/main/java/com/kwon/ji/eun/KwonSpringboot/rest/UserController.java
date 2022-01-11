package com.kwon.ji.eun.KwonSpringboot.rest;

import com.kwon.ji.eun.KwonSpringboot.dto.UserDto;
import com.kwon.ji.eun.KwonSpringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/dev/*")
@RequiredArgsConstructor
public class UserController{

    private final UserService userService;

    @GetMapping("/user")
    public List<UserDto> findAll(){
        return userService.findAll();
    }
}

