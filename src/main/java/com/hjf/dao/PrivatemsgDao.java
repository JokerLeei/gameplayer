package com.hjf.dao;

import com.hjf.entity.Privatemsg;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Repository
public interface PrivatemsgDao {
    int SendPro(@Param("privatemsgSendid") Integer privatemsgSendid,
                @Param("privatemsgSendname") String privatemsgSendname,
                @Param("privatemsgAcceptid") Integer privatemsgAcceptid,
                @Param("privatemsgAcceptname") String privatemsgAcceptname,
                @Param("privatemsgContent") String privatemsgContent,
                @Param("privatemsgTime") String privatemsgTime);

    ArrayList<Privatemsg> showMsgPro(@Param("privatemsgAcceptid") Integer privatemsgAcceptid);

    Privatemsg Refreshmsg(@Param("privatemsgAcceptid")  Integer privatemsgAcceptid);
}
