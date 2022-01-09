package com.kwon.ji.eun.KwonSpringboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    public List<HashMap> findAll();
}
