package ch14;

import java.util.*;

public class ArrayList_test {
	public static void main(String[] args){
		ArrayList arrayList = new ArrayList ();
        // 加入資料
        System.out.println(arrayList.add("第一筆資料"));
        System.out.println(arrayList.add("第二筆資料"));
        System.out.println(arrayList.add("第二筆資料"));
        System.out.println(arrayList.add("第三筆資料"));
        // 取得資料數量
        System.out.println(arrayList.size());
        // 判斷是否有某一筆資料
        System.out.println(arrayList.contains("第二筆資料"));
        // 移除資料
        System.out.println(arrayList.remove("第二筆資料"));
        System.out.println(arrayList.size());
        // 列出所有資料
        for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
        }
	}
}
