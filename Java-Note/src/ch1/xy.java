package ch1;

public class xy { //此檔案勇已表示二維陣列
	public static void main(String args[]){
		int[][] cords = { //二維陣列的宣告
				{1,2,3},
				{4,5,6}
		};
		
		for(int i = 0 ; i < cords.length; i++){  //得到cords的列數
			for(int j = 0 ; j < cords[i].length ; j++){ //得到每列有幾個元素，相當於"行數"
				System.out.printf("%2d", cords[i][j]);			
			}
			System.out.println();
		}
		
		for(int[] row : cords) { //使用便捷寫法
		    for(int value : row) {
		        System.out.printf("%2d", value);
		    }
		    System.out.println();
		}
		
		//二維陣列的非方陣宣告 
		int arr[][] = new int[2][]; //此處生成兩個索引，但是第二個索引沒有值，因此兩列都指向null
		arr[0] = new int[]{1,2,3}; //幫第一列建立參考物件
		arr[1] = new int[]{1,2}; //幫第二列建立參考物件
		 
		/*也可以如此建立非方陣二維陣列
		 * int[][] arr = {
		 * 	{1,2,3},
		 * 	{1,2}
		 * };
		 * */
		
		for(int[] i : arr){
			for (int j : i){
				System.out.printf("%2d", j);
			}
			
			System.out.println();
		}
	}
}
