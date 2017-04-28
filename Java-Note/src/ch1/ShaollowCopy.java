package ch1;

//此檔案用來練習已自行生成的類別矩陣，參考改變所導致的矩陣內容改變的情形
class Clothes{ 
	String color;
    char size;
    Clothes(String color, char size) { //定義Clothes的建構式
        this.color = color;
        this.size = size;
    }
}

public class ShaollowCopy {
	public static void main(String args[]){
		Clothes[] c1 = {new Clothes("red", 'L'), new Clothes("blue", 'M')};
        Clothes[] c2 = new Clothes[c1.length];
        for(int i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }
        c1[0].color = "yellow"; //改變參考內容，因此後來參考的陣列內容也改變了
        System.out.println(c2[0].color); //結果導致印出並非原本的blue，而是yellow
	}
}
