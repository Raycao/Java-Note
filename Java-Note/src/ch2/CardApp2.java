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
        for(CashCard2 card : cards) { //�ϥ�for���覡�A�]���C����card���O���@�˪��b��
            System.out.printf("�� (%s, %d, %d) �x�ȡG", 
                    card.number, card.balance, card.bonus);
            card.store(scanner.nextInt()); //�I�s�x�s����k
            System.out.printf("���� (%s, %d, %d)%n",
                    card.number, card.balance, card.bonus);
        }
    }
}
