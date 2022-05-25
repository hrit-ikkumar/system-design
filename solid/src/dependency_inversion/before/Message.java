package dependency_inversion.before;

import java.time.LocalDate;
import java.time.ZoneId;

public class Message {
    String msg;
    LocalDate date;

    public Message(String msg) {
        this.msg = msg;
        this.date = LocalDate.now(ZoneId.of("UTc"));
    }

    public String getMsg() {
        return msg;
    }

    public LocalDate getDate() {
        return date;
    }
}
