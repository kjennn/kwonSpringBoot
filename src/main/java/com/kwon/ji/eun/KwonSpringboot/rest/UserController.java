package com.kwon.ji.eun.KwonSpringboot.rest;

import com.kwon.ji.eun.KwonSpringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("user")
    public List<HashMap> findAll(){
        return userService.findAll();
    }
}

