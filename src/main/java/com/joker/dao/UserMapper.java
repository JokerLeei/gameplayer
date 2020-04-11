package com.joker.dao;

import com.joker.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Mapper
public interface UserMapper {

    Userinfo loginPro(@Param("userinfoName") String userinfoName,
                      @Param("userinfoPwd") String userinfoPwd);

    int registerPro(@Param("userinfoName") String userinfoName,
                    @Param("userinfoPwd") String userinfoPwd,
                    @Param("userinfoCreatetime") String userinfoCreatetime);


    Userinfo showUserPro(@Param("userinfoId") Integer userinfoId);

    int updatePwdPro(@Param("userinfoPwd") String userinfoPwd,
                     @Param("userinfoId") Integer userinfoId);

    ArrayList<Userinfo> showAlluserPro();

    int insertUserPro(@Param("userinfoName") String userinfoName,
                      @Param("userinfoPwd") String userinfoPwd,
                      @Param("userinfoEmail") String userinfoEmail,
                      @Param("userinfoPhone") String userinfoPhone,
                      @Param("userinfoSex") String userinfoSex,
                      @Param("userinfoBirthday") Date userinfoBirthday,
                      @Param("userinfoCreatetime") String userinfoCreatetime,
                      @Param("userinfoImg") String userinfoImg);

    int deleteUserPro(@Param("userinfoId") Integer userinfoId);

    int updateUserPro(@Param("userinfoImg") String userinfoImg,
                      @Param("userinfoName") String userinfoName,
                      @Param("userinfoSex") String userinfoSex,
                      @Param("userinfoBirthday") Date userinfoBirthday,
                      @Param("userinfoId") Integer userinfoId);

    Map getSexPro();

    Map getAgePro();

    Userinfo duplicatePro(@Param("userinfoName") String userinfoName);

    Userinfo getUserIdPro(@Param("userinfoName") String userinfoName);

    int updateEmailPro(@Param("userinfoEmail") String userinfoEmail,
                       @Param("userinfoId") Integer userinfoId);

    int updatePhonePro(@Param("userinfoPhone") String userinfoPhone,
                       @Param("userinfoId") Integer userinfoId);

    Userinfo getUserPro(@Param("userinfoName") String userinfoName);

    void updateSendname(@Param("userinfoName") String userinfoName,
                        @Param("userinfoId") Integer userinfoId);

    void updateAcceptname(@Param("userinfoName") String userinfoName,
                          @Param("userinfoId") Integer userinfoId);

    void updatePsotname(@Param("userinfoName") String userinfoName,
                        @Param("userinfoId") Integer userinfoId);

    ArrayList<Userinfo> showLikePro(@Param("userinfoName") String userinfoName);
}
