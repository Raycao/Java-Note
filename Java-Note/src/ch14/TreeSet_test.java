package ch14;

import java.util.*;

public class TreeSet_test {
	public static void main(String[] args){
		TreeSet treeSet = new TreeSet ();
        // 加入資料
        System.out.println(treeSet.add(1));
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(2));
        System.out.println(treeSet.add(4));
        // 取得資料數量
        System.out.println(treeSet.size());
        // 判斷是否有某一筆資料
        System.out.println(treeSet.contains(1));
        // 移除資料
        System.out.println(treeSet.remove(4));
        // 列出所有資料
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
                System.out.println(iterator.next());
        }
	}
}
