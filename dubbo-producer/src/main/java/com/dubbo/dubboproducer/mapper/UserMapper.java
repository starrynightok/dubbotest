package com.dubbo.dubboproducer.mapper;

import com.dubbo.dubboapi.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "phone", property = "phone"),
            @Result(column = "email", property = "email")
    })
    @Select("select * from user where id=#{id}")
    User getUserById(String id);
}
