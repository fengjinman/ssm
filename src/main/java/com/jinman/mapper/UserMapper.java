package com.jinman.mapper;

import com.jinman.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    User findUserById(int id);
}