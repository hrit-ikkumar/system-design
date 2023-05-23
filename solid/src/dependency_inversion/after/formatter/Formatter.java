package dependency_inversion.after.formatter;

import dependency_inversion.after.message.Message;

public interface Formatter {
    public String format(Message msg);
}
