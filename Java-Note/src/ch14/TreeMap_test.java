package ch14;

import java.util.*;

public class TreeMap_test {
	public static void main(String args[]){
		TreeMap treeMap = new TreeMap ();
        // 加入資料
        treeMap.put(1,"第一筆資料");
        treeMap.put(3,"第三筆資料(前)");
        treeMap.put(3,"第三筆資料(後)");
        treeMap.put(2,"第二筆資料");
        treeMap.put(4,"第四筆資料");
        // 取得資料數量
        System.out.println(treeMap.size());
        // 判斷是否有某一筆資料
        System.out.println(treeMap.containsKey(1));
        System.out.println(treeMap.containsValue("第一筆資料"));
        // 移除資料
        System.out.println(treeMap.remove(4));
        // 列出所有資料
        System.out.println(treeMap.entrySet());

	}
}
