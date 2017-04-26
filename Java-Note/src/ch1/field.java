package ch1;
//field檔案中有兩個類別，一個是公開（public）的field類別，所以檔案主檔名必須是field，另一個是非公開的human，一個原始碼中可以有多個類別定義，但只能有一個是公開類別，且檔案主檔名必須與公開類別名稱相同。



class human{ //human中有兩個域值(field)
	int height; //稱為域值(field)
	int weight; //稱為域值(field)
}

public class field {
	public static void main(String args[]){
		human jack = new human(); //實作出名為jack的human物件
		human finn = new human(); //實作出名為finn的human物件
		
		jack.height = 12; 
		jack.weight = 15;
		
		finn.height = 20;
		finn.weight = 25;
		
		System.out.printf("jack's height:%d , jack's weight:%d %n",jack.height,jack.weight);
		System.out.printf("finn's height:%d , finn's weight:%d %n",finn.height,finn.weight);
		
	}
}
