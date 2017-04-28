package ch1;

class mynumber{
	int n;
}

public class var {
	public static void main(String args[]){
		n = 10; //因為n並未在此生成，因此這樣是無法使用的
		System.out.println("n="+n);
	}
}
