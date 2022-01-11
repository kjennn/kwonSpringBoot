package com.kwon.ji.eun.KwonSpringboot.service;

import com.kwon.ji.eun.KwonSpringboot.dto.UserDto;
import com.kwon.ji.eun.KwonSpringboot.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<UserDto> findAll() {
        return userMapper.findAll();
    }
}
