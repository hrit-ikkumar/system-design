package dependency_inversion.after;

public class JSONFormatter implements Formatter {
    @Override
    public String format(Message msg) {
        String result = "";

        result += "{ message: " + msg.getMsg() + "}";

        return result;
    }
}
