package ch12;

class classA{} //�Ū����O

public class MainClass {
	public static void main(String[] args){
		classA a = new classA()
			{ //����ưΦW���O�A���O��H������ơA��@�ΦW���O�|�b�᭱���W{}�A�æb�䤺��W�{���X
			
			//�z�L��@�ΦW���O�A�b�����OclassA���h�[���function
			    public void function1(int x, int y) { 
					System.out.println(x + y);
			    }
		 
			    public int function2(int x) {
					return x + 1;
			    }
			}; //�`�N�b���n�[�W�����A�ŧѰO
	}
}
