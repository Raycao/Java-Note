package ch3;

public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
    	//�O�o����ҥX��
        SwordsMan swordsMan = new SwordsMan();
        /*
         * �H�U�i�H�o�{�A���M���Ǥ�k�S���g�bSwordsMan��
         * �o�i�H�ϥΥB�I�s�A��]�Ӧ۩�SwordsMan�~�Ӧ�Role
         * ��Role���쥻�N���w�q����k�A�]��SwordsMan�i�H�ϥ�
         * */
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.printf("�C�h�G(%s, %d, %d)%n", swordsMan.getName(), 
                swordsMan.getLevel(), swordsMan.getBlood());
    }

    static void demoMagician() {
        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.printf("�]�k�v�G(%s, %d, %d)%n", magician.getName(), 
                magician.getLevel(), magician.getBlood());
    }
}