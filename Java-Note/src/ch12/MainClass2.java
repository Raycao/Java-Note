package ch12;

//�D�ΦW���O�Ҥl
class classA2{}
class classB extends classA2{
	//�b�t�~���a��ŧiclass
	public void function1(int x, int y) {
		 
    }
 
    public int function2(int x) {
		return x + 1;
    }
}

public class MainClass2 {
	public static void main(String[] args){
		classA2 a = new classB();
	}
}
