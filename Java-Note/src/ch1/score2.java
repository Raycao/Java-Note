package ch1;

import java.util.Arrays; //載入後可以使用陣列物件的方法

public class score2 { //此檔案用來練習以new生成的陣列
	public static void main(String args[]){ 
		int[] scores = new int[10]; //使用new建立物件，int的陣列初始值內容為0
	
		for(int i : scores){  //印出矩陣內容，發現內容物皆為0
			System.out.printf("%2d", i);
		}
		
		System.out.println();
		Arrays.fill(scores,60); //使用fill方法，將矩陣內容以60填滿
		
		for(int i : scores){ //印出矩陣內容，發現皆為60
			System.out.printf("%3d", i);
		}
	}
}
