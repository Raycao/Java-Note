package ch4;

public class doSome {
	public static void main(String[] args){
		Other o = new Other();
	}
}

class Some {
    Some() {
        System.out.println("呼叫Some()");
    }
}
class Other extends Some {
    Other() {
    	//這邊會先呼叫父類別的建構式
    	//因為沒有定義，預設會是 super();
    	//也就是呼叫夫類別的吳引數建構式
        System.out.println("呼叫Other()");
    }
}