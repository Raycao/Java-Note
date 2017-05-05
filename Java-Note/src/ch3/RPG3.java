package ch3;

public class RPG3 {
	//�s�[�JdrawFight����k
	public static void main(String[] args) {
        SwordsMan2 swordsMan = new SwordsMan2();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        Magician2 magician = new Magician2();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        
        showBlood(swordsMan);
        showBlood(magician);
        
        drawFight(swordsMan);
        drawFight(magician);
    }

    static void showBlood(Role2 role) {
        System.out.printf("%s ��q %d%n",
                role.getName(), role.getBlood());
    }
    
    static void drawFight(Role2 role) {
    	//����k�ϥΨ�fight��k
    	//�]���쥻��Role.java�S���w�qfight�A�]��role.fight()�o�@��|�s�@���~
    	//�Y�K�~�Ӫ�SwordsMan�PMagician�����w�qfight
    	//�ҥH�o�䭫�s�g�@��Role2.java�A���tfight��k
        System.out.print(role.getName());
        role.fight();
    }
}
