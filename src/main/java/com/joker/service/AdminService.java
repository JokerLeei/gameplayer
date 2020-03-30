package com.joker.service;

import com.joker.entity.Admin;

public interface AdminService {

    Admin login(String adminName, String adminPwd);

    Integer getId(String adminName);
}
