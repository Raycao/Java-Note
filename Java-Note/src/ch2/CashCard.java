package ch2;

public class CashCard { 
	String number;
    int balance;
    int bonus;
    
    //透過建構式的建立，再重複的程式片段可以避免語法的重複操作
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
}
