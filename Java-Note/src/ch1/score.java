package ch1;

public class score { //此檔案用於測試矩陣 
	public static void main(String args[]){
		int[] scores = {90,100,50,60}; //矩陣宣告 
		for(int i = 0; i < scores.length; i++) //使用for迴圈逐一列出
			System.out.printf("分數:%d %n", scores[i]); 
	
		for(int j:scores){ //另一種for迴圈表示方式，用在矩陣上
			System.out.printf("分數:%d %n", j); 
			
		}
	}
}
