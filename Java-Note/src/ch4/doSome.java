package ch4;

public class doSome {
	public static void main(String[] args){
		Other o = new Other();
	}
}

class Some {
    Some() {
        System.out.println("�I�sSome()");
    }
}
class Other extends Some {
    Other() {
    	//�o��|���I�s�����O���غc��
    	//�]���S���w�q�A�w�]�|�O super();
    	//�]�N�O�I�s�����O���d�޼ƫغc��
        System.out.println("�I�sOther()");
    }
}