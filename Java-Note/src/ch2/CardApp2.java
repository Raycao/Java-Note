package ch2;

import java.util.Scanner;

public class CardApp2 {
    public static void main(String[] args) {
        CashCard2[] cards = {
            new CashCard2("A001", 500, 0),
            new CashCard2("A002", 300, 0),
            new CashCard2("A003", 1000, 1)
        };

        Scanner scanner = new Scanner(System.in);
        for(CashCard2 card : cards) { //使用for的方式，因此每次的card都是不一樣的帳戶
            System.out.printf("為 (%s, %d, %d) 儲值：", 
                    card.number, card.balance, card.bonus);
            card.store(scanner.nextInt()); //呼叫儲存的方法
            System.out.printf("明細 (%s, %d, %d)%n",
                    card.number, card.balance, card.bonus);
        }
    }
}
