package ch2;

class CashCard3 {
    //�ڭ̱N�ܼƩw�q��private�A�ҥH�S��k������o���ܼƶi��s��
	//�ݭn�z�L��k�~����k�s���o���ܼ�
	private String number;
    private int balance;
    private int bonus;
    
    void store(int money) {
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) {
                this.bonus++;
            }
        }
        else {
            System.out.println("�x�ȬO�t���H�A�O�Ӷê��ܡH");
        }
    }
    
    //�]���S����k�����s����ơA�]�ϧڭ̤]�����g��k�Ө��X���
    //�S��k��CardApp2.java�A��card.number�o�˪��覡�������o���   
    int getBalance() {
        return balance;
    }

    int getBonus() {
        return bonus;
    }

    String getNumber() {
        return number;
    }
}
