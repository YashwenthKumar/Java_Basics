package Maps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("yash", 511);
        empIds.put("suda", 531);
        empIds.put("Ismael", 569);
        empIds.put("dinesh", 502);
        empIds.put("Viswaj", 564);
        System.out.println(empIds);
        System.out.println(empIds.get("yash"));
        System.out.println(empIds.containsKey("yash"));
        System.out.println(empIds.containsValue(531));
        empIds.replace("yash", 510);
        System.out.println(empIds);
        empIds.put("Kosuri", 532);
        System.out.println(empIds);
        empIds.remove("Kosuri");
        System.out.println(empIds);
    }
}
