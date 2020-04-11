package com.joker.dao;

import com.joker.entity.Privatemsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface PrivatemsgMapper {
    int SendPro(@Param("privatemsgSendid") Integer privatemsgSendid,
                @Param("privatemsgSendname") String privatemsgSendname,
                @Param("privatemsgAcceptid") Integer privatemsgAcceptid,
                @Param("privatemsgAcceptname") String privatemsgAcceptname,
                @Param("privatemsgContent") String privatemsgContent,
                @Param("privatemsgTime") String privatemsgTime);

    ArrayList<Privatemsg> showMsgPro(@Param("privatemsgAcceptid") Integer privatemsgAcceptid);

    Privatemsg Refreshmsg(@Param("privatemsgAcceptid")  Integer privatemsgAcceptid);
}
