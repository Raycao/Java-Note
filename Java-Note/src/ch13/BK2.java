package ch13;

public class BK2 {
	public static void main(String [] args){
		int a = 4;
		
		for(int i = 0; i < a ; i++){
			if(i==2)
				continue;
			System.out.println(i);
		}
	}
}
