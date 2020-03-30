package com.joker.dao;

import com.joker.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {

    Admin loginPro(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);

    Integer getIdPro(@Param("adminName") String adminName);
}