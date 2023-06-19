package splitwise.dao.common;

import java.util.HashMap;
import java.util.Map;

public enum TransactionType {
    PAID("paid"),
    OWE("owe"),
    SELF("self");

    private final String type;

    TransactionType(String type) {
        this.type = type;
    }
    private static Map<String, TransactionType> map = new HashMap<>();
    static{
        for(TransactionType transactionType: values()) {
            map.put(transactionType.type, transactionType);
        }
    }

    public static TransactionType of(String type) {
        return map.get(type);
    }

    public String getType() {
        return this.type;
    }
}
