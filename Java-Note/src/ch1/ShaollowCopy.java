package ch1;

//���ɮץΨӽm�ߤw�ۦ�ͦ������O�x�}�A�Ѧҧ��ܩҾɭP���x�}���e���ܪ�����
class Clothes{ 
	String color;
    char size;
    Clothes(String color, char size) { //�w�qClothes���غc��
        this.color = color;
        this.size = size;
    }
}

public class ShaollowCopy {
	public static void main(String args[]){
		Clothes[] c1 = {new Clothes("red", 'L'), new Clothes("blue", 'M')};
        Clothes[] c2 = new Clothes[c1.length];
        for(int i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }
        c1[0].color = "yellow"; //���ܰѦҤ��e�A�]����ӰѦҪ��}�C���e�]���ܤF
        System.out.println(c2[0].color); //���G�ɭP�L�X�ëD�쥻��blue�A�ӬOyellow
	}
}
