package com.joker.service;

import com.joker.entity.Privatemsg;

import java.util.ArrayList;

public interface PrivatemsgService {
    int Send(Integer privatemsgSendid,
             String privatemsgSendname,
             Integer privatemsgAcceptid,
             String privatemsgAcceptname,
             String privatemsgContent);

    ArrayList<Privatemsg> showMsg(Integer privatemsgAcceptid);

    Privatemsg Refreshmsg(Integer privatemsgAcceptid);
}
