package parkinglot.dao.constants;

import java.util.HashMap;

public enum Command {
    CREATE_PARKING_LOT("create_parking_lot"),
    DISPLAY("display"), PARK_VEHICLE("park_vehicle"), EXIT("exit");

    private final String command;
    Command(String s) {
        this.command = s;
    }
    
    public String toString() {
        return this.command;
    }
    
    private static final HashMap<String, Command> map = new HashMap<>();
    
    static {
        for(Command c: values()) {
            map.put(c.command, c);
        }
    }
    
    public static Command of(String name) {
        return map.get(name);
    }
}
