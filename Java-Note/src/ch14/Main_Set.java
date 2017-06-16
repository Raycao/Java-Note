package ch14;

import static java.lang.System.out;
import java.util.*;

public class Main_Set {
	public static void main(String[] args) {
        Set<String> admins = new HashSet<>(Arrays.asList("Justin", "caterpillar"));
        Set<String> users = new HashSet<>(Arrays.asList("momor", "hamini", "Justin"));
 
        out.println(admins.contains("Justin")); // 是否在站長群？true
 
        Set<String> intersection = new HashSet<>(admins);
        intersection.retainAll(users); // 同時是站長群也是使用者群的？，作交集
        out.println(intersection);  // [Justin]
 
        Set<String> union = new HashSet<>(admins);
        union.addAll(users);  // 是站長群或是使用者群的？，作聯集
        out.println(union);  // [momor, hamini, Justin, caterpillar]
 
        Set<String> adminsButNotUsers = new HashSet<>(admins);
        adminsButNotUsers.removeAll(users);  // 站長群但不使用者群的？
        out.println(adminsButNotUsers);  // [caterpillar]
 
        Set<String> xor = new HashSet<>(union);
        xor.removeAll(intersection);  // xor
        out.println(xor); // [momor, hamini, caterpillar]
 
        out.println(admins.containsAll(users));  // ∈，false
        out.println(users.containsAll(admins));  // false
    }
}
