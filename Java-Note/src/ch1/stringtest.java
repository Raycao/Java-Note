package ch1;

public class stringtest {
	public static void main(String args[]){
		String name = "justin";                    // 建立String實例
		System.out.println(name);                  // 顯示justin
		System.out.println(name.length());       // 顯示長度為6
		System.out.println(name.charAt(0));      // 顯示第一個字元j
		System.out.println(name.toUpperCase()); // 顯示JUSTIN
	
		char[] cs = {'j', 'u', 's', 't', 'i', 'n'}; //已擁有字元陣列
		String name2 = new String(cs); //利用字元陣列建構字串
		char[] cs2 = name.toCharArray(); //將字串以字元陣列的方式傳回
		
		String name3 = "Justin";
		System.out.println("你的名字是：" + name3); //使用+來串接字串
		
		/* 將輸入字串轉換為整路等的基本型態
		Byte.parseByte(number) 		將number剖析為byte整數
		Short.parseShort(number) 	將number為short整數
		Integer.parseInt(number) 	將number為int整數
		Long.parseLong(number) 		將number為long整數
		Float.parseFloat(number) 	將number為float浮點數
		Double.parseDouble(number) 	將number剖析為double浮點數
		 */
	}
}
