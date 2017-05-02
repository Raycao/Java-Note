package ch2;

class CashCard3 {
    //我們將變數定義為private，所以沒辦法直接對這些變數進行存取
	//需要透過方法才有辦法存取這些變數
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
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
    }
    
    //因為沒有辦法直接存取資料，因使我們也必須寫方法來取出資料
    //沒辦法像CardApp2.java，用card.number這樣的方式直接取得資料   
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
