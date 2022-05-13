package cg.park.testSpringBoot.comm.util;

import lombok.Data;

@Data
public class Message {
    private String returnMessage;
    private String returnCode;
    private Param data;

    public Message (Param param) {
        this.returnCode = String.valueOf(param.get("code"));
        this.data = param.data(param);
    }

    public Message () {};

    public Message setCode(String code) {
        this.returnCode = code;
        return this;
    }


    public Message setMessage(String message) {
        this.returnMessage = message;
        return this;
    }
}
