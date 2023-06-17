package splitwise.dao.common;

import java.util.HashMap;

public enum Command {
    SHOW("show"),
    CREATE_USER("create_user"),
    EXPENSE("expense"),
    QUIT("quit");

    private final String name;
    Command(String name) {
        this.name = name;
    }


    private static final HashMap<String, Command> map = new HashMap<>(values().length, 1);

    static {
        for(Command c: Command.values()) {
            map.put(c.getName(), c);
        }
    }

    public String getName(){
        return this.name;
    }

    public static Command of(String name) {
        return map.get(name);
    }
}
