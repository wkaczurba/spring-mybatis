package com.wkaczurba.mybatis.mapper;

import com.wkaczurba.mybatis.model.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersMapper {


    @Select("select * from users")
    List<Users> findAll();

}
