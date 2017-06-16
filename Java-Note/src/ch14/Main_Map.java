package ch14;

import java.util.*;
import static java.lang.System.out;

public class Main_Map {
	public static void main(String[] args) {
        Map<String, Integer> passwords = new HashMap<>();
        passwords.put("Justin", 123456);
        passwords.put("caterpillar", 93933);
 
        out.println(passwords.get("Justin")); // 123456
 
        passwords.put("Hamimi", 970221);  // 增加一對鍵值
        out.println(passwords);  // {Justin=123456, caterpillar=93933, Hamimi=970221}
 
        passwords.remove("caterpillar");  // 刪除一對鍵值
        out.println(passwords);  // {Justin=123456, Hamimi=970221}
 
        out.println(passwords.entrySet()); // [Justin=123456, Hamimi=970221]
        out.println(passwords.keySet());   // [Justin, Hamimi]
        out.println(passwords.values());   // [123456, 970221]
    }
}
