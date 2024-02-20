package com.websocket.demo.chat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter

public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int countUser ;
    public static int UpdateCountUser;

    public void setCount(int n){
        countUser = n;
    }

    public  static  int UpdateCountUserinc(){
        UpdateCountUser++ ;
        return UpdateCountUser;
    }

    public  static  int UpdateCountUserdec(){
        UpdateCountUser-- ;
        return UpdateCountUser;
    }

}