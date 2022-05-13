package cg.park.testSpringBoot.comm.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Configuration
public class Proxy {
    public ResponseEntity<Message> res(Param param) {
        Message message = new Message(param);
        return (message.getReturnCode().startsWith("S"))
                ? new ResponseEntity<>(success(message), HttpStatus.OK)
                : new ResponseEntity<>(fail(message), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private Message fail(Message message) { return new Message().setMessage("오류발생"); }

    private Message success(Message message) {
        return message.setMessage("정상 처리되었습니다.");
    }
}
