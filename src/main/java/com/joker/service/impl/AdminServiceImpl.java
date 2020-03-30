package com.joker.service.impl;

import com.joker.dao.AdminDao;
import com.joker.entity.Admin;
import com.joker.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(String adminName, String adminPwd) {
        return adminDao.loginPro(adminName,adminPwd);
    }

    @Override
    public Integer getId(String adminName) {
        return adminDao.getIdPro(adminName);
    }
}
