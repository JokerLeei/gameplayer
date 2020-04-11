package com.joker.service.impl;

import com.joker.dao.UserMapper;
import com.joker.entity.Userinfo;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Userinfo login(String userinfoName, String userinfoPwd) {
        return userMapper.loginPro(userinfoName,userinfoPwd);
    }

    @Override
    public int register(String userinfoName, String userinfoPwd) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("用户创建时间：" + dateFormat.format(date));
        String userinfoCreatetime =  dateFormat.format(date);
        return userMapper.registerPro(userinfoName,userinfoPwd,userinfoCreatetime);
    }

    @Override
    public int updateUser(String userinfoImg,String userinfoName, String userinfoSex, Date userinfoBirthday, Integer userinfoId) {

        userMapper.updateSendname(userinfoName,userinfoId);
        userMapper.updateAcceptname(userinfoName,userinfoId);
        userMapper.updatePsotname(userinfoName,userinfoId);
        return userMapper.updateUserPro(userinfoImg,userinfoName,userinfoSex,userinfoBirthday,userinfoId);
    }

    @Override
    public Userinfo showUser(Integer userinfoId) {
        return userMapper.showUserPro(userinfoId);
    }

    @Override
    public int updatePwd(String userinfoPwd, Integer userinfoId) {
        return userMapper.updatePwdPro(userinfoPwd,userinfoId);
    }

    @Override
    public ArrayList<Userinfo> showAllUser() {
        return userMapper.showAlluserPro();
    }

    @Override
    public int insertUser(String userinfoName, String userinfoPwd, String userinfoEmail, String userinfoPhone,
                          String userinfoSex, Date userinfoBirthday,String userinfoImg) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("用户创建时间：" + dateFormat.format(date));
        String userinfoCreatetime =  dateFormat.format(date);
        return userMapper.insertUserPro(userinfoName,userinfoPwd,userinfoEmail,userinfoPhone,userinfoSex,
                userinfoBirthday,userinfoCreatetime,userinfoImg);
    }

    @Override
    public int deleteUser(Integer userinfoId) {
        return userMapper.deleteUserPro(userinfoId);
    }

    @Override
    public Map getSex() {
        Map getsex = userMapper.getSexPro();
        return getsex;
    }

    @Override
    public Map getAge() {
        Map getAge = userMapper.getAgePro();
        return getAge;
    }

    @Override
    public Userinfo duplicate(String userinfoName) {
        return userMapper.duplicatePro(userinfoName);
    }

    @Override
    public Userinfo getUserId(String userinfoName) {
        return userMapper.getUserIdPro(userinfoName);
    }

    @Override
    public int updateEmail(String userinfoEmail, Integer userinfoId) {
        return userMapper.updateEmailPro(userinfoEmail,userinfoId);
    }

    @Override
    public int updatePhone(String userinfoPhone, Integer userinfoId) {
        return userMapper.updatePhonePro(userinfoPhone,userinfoId);
    }

    @Override
    public Userinfo getUser(String userinfoName) {
        return userMapper.getUserPro(userinfoName);
    }

    @Override
    public ArrayList<Userinfo> showLike(String userinfoName) {
        return userMapper.showLikePro(userinfoName);
    }
}
