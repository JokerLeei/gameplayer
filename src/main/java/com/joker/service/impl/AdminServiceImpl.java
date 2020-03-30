package com.joker.service.impl;

import com.joker.dao.AdminMapper;
import com.joker.entity.Admin;
import com.joker.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(String adminName, String adminPwd) {
        return adminMapper.loginPro(adminName,adminPwd);
    }

    @Override
    public Integer getId(String adminName) {
        return adminMapper.getIdPro(adminName);
    }
}
