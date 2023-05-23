package dependency_inversion.after.formatter;

import dependency_inversion.after.message.Message;

public class JSONFormatter implements  Formatter{
    @Override
    public String format(Message msg) {
        String result = "";

        result += "{ message: " + msg.getMsg() + "}";

        return result;
    }
}
