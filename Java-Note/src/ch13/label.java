package ch13;

public class label {
	public static void main(String[] args){
		int a,b;
		
L1:		for(a=1;a<=2;a++){
			System.out.println("a = "+a);
			
L2:			for(b=1;b<=5;b++){
				if(b==3)
					break L2;
				System.out.println("b = "+b);
			}
		}
		
		
	}
}
