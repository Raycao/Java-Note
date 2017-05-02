package ch2;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
        	//由於CahCard這個類別我們已經定義了其建構式
        	//因此在new的時候可以一併把參數給設定進去
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1),
            new CashCard("A004", 2000, 2),
            new CashCard("A005", 3000, 3)
            
            /*
             * 倘若沒有設定建構式，我們必須new完物件後，進行個別墅值的設定
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