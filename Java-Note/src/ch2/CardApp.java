package ch2;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
        	//�ѩ�CahCard�o�����O�ڭ̤w�g�w�q�F��غc��
        	//�]���bnew���ɭԥi�H�@�֧�ѼƵ��]�w�i�h
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1),
            new CashCard("A004", 2000, 2),
            new CashCard("A005", 3000, 3)
            
            /*
             * �խY�S���]�w�غc���A�ڭ̥���new�������A�i��ӧO�֭Ȫ��]�w
            CashCard card1 = new CashCard();
			card1.number = "A001";
			card1.balance = 500;
			card1.bonus = 0;
			*/
        };
        
        for(CashCard card : cards) {
            System.out.printf("(%s, %d, %d)%n",
                    card.number, card.balance, card.bonus);
        }
    }
}