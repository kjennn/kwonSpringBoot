package com.kwon.ji.eun.KwonSpringboot.mapper;

import com.kwon.ji.eun.KwonSpringboot.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserDto> findAll();
}
