package ch4;

public class doSome2 {
	public static void main(String[] args){
		Other2 o = new Other2();
	}
}

class Some2 {
    Some2() {
        System.out.println("©I¥sSome()");
    }
    Some2(int i) {
        System.out.println("©I¥sSome(int i)");
    }
}
class Other2 extends Some2 {
    Other2() {
        super(10);
        System.out.println("©I¥sOther()");
    }
}