package com.ankur.Baby_level._6_SocketsAndNetworking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONize {
    private final HashMap<String, Object> dict;

    public JSONize() {
        dict = new HashMap<>();
    }

    public void put(String key, Object value) {
        dict.put(key, value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (final Map.Entry<String, Object> entry : dict.entrySet()) {
            final String key = entry.getKey();
            final Object value = entry.getValue();

            sb.append(key).append(": ");
            switch (value) {
                case Number _ -> {
                    if (value instanceof Integer) {
                        sb.append(((Integer) value).intValue());
                    }
                    if (value instanceof Double) {
                        sb.append(((Double) value).doubleValue());
                    }
                }
                case List<?> _, Boolean _, JSONize _ -> sb.append(value);
                case null, default -> sb.append(key).append(": \"").append(value).append("\"");
            }
            sb.append(",\n");
        }
        return sb.append("}").toString();
    }

    static void main() {
        JSONize json = new JSONize();
        JSONize a = new JSONize();
        json.put("Name", "Ankur");
        json.put("age", 21);
        json.put("CGPA", 8.59);

        a.put("Chem", 80);
        a.put("Phy", 90);
        a.put("Bio", 70);

        json.put("Subjects", a);
        System.out.println(json);
    }
}
