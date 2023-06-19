package splitwise.dao.common;

import splitwise.dao.entity.split.Split;

import java.util.HashMap;

public enum SplitType {
    EQUAL("equal"),
    EXACT("exact"),
    PERCENT("percent");

    private String value;
    SplitType(String value) {
        this.value = value;
    }

    private static HashMap<String, SplitType> map = new HashMap<>(values().length, 1f);
    static {
        for(SplitType splitType: values()) {
            map.put(splitType.value, splitType);
        }
    }

    public static SplitType getType(String value){
        return map.get(value);
    }
}
