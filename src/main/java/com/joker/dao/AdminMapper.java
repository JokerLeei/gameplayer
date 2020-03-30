package com.joker.dao;

import com.joker.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {

    Admin loginPro(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);

    Integer getIdPro(@Param("adminName") String adminName);
}
