package ch1;

class human2{ //humanいΤㄢ办(field)
	
	int height; //嘿办(field)
	int weight; //嘿办(field)
	human2(int height , int weight){ //ミ篶Α箇砞篶Α琌⊿Τま计硂娩┮糶篶Αㄢま计だ蔼籔秖
		this.height = height; //ㄏノthisボ盢ㄓheight肚计﹚倒"硂ン"height
		this.weight = weight; //
	}
}

public class field2 {
	public static void main(String args[]){
		human2 jack = new human2(12,15); //龟jackhumanンㄖ倒ぉ把计よ獽篶ΑネΘ
		human2 finn = new human2(20,25); //龟finnhumanンㄖ倒ぉ把计よ獽篶ΑネΘ
		
		
		System.out.printf("jack's height:%d , jack's weight:%d %n",jack.height,jack.weight);
		System.out.printf("finn's height:%d , finn's weight:%d %n",finn.height,finn.weight);
		
	}
}
