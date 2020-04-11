package com.joker.service.impl;

import com.joker.dao.PrivatemsgMapper;
import com.joker.entity.Privatemsg;
import com.joker.service.PrivatemsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PrivatemsgServiceImpl implements PrivatemsgService {

    @Autowired
    private PrivatemsgMapper privatemsgMapper;

    @Override
    public int Send(Integer privatemsgSendid, String privatemsgSendname, Integer privatemsgAcceptid,
                    String privatemsgAcceptname, String privatemsgContent) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("用户发送时间：" + dateFormat.format(date));
        String privatemsgTime =  dateFormat.format(date);
        return privatemsgMapper.SendPro(privatemsgSendid,privatemsgSendname,privatemsgAcceptid,privatemsgAcceptname,
                privatemsgContent,privatemsgTime);
    }

    @Override
    public ArrayList<Privatemsg> showMsg(Integer privatemsgAcceptid) {
        return privatemsgMapper.showMsgPro(privatemsgAcceptid);
    }

    @Override
    public Privatemsg Refreshmsg(Integer privatemsgAcceptid) {
        return privatemsgMapper.Refreshmsg(privatemsgAcceptid);
    }
}
