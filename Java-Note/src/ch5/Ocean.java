package ch5;

public class Ocean {
    public static void main(String[] args) {
        
    	//�Q�Φh�����覡�A�o��Ψ쪺�O�������h��
    	//�H�U���O������@Swimmer����
    	doSwim(new Anemonefish2("����"));
        doSwim(new Shark2("����"));
        doSwim(new Human("�봵��"));
        doSwim(new Submarine("����@��"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}
